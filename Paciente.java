
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Paciente {
    private int codigo;
    private String nome;
    private String endereco;
    private String CEP;
    private String telefone;
    private String dataNascimento;
    private String RG;
    private String CPF;

    private Cidade cidade = new Cidade();


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF(){
        return CPF;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public void cadastrar() throws ParseException {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe os dados do PAciente");
        System.out.println("Nome: ");
        this.setNome(tec.nextLine());
        System.out.println("Endereço: ");
        this.setEndereco(tec.nextLine());
        System.out.println("CEP: ");
        this.setCEP(tec.nextLine());
        System.out.println("Telefone: ");
        this.setTelefone(tec.nextLine());
        System.out.println("Data de Nascimento: Ex 12/12/1999 ");
        this.setDataNascimento(tec.nextLine());

        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = df.parse(dataRecebida);
        this.setDataNascimento(dt);

        System.out.println("RG: ");
        this.setRG(tec.findInLine());
        System.out.println("CPF: ");
        this.setCPF(tec.nextLine());
        cidade.cadastrar();


    }
    public void imprimirPaciente (){
        SimpleDateFormat formataData= new SimpleDateFormat("dd/mm/yyyy");
        String stringData = formataData.format(this.getDataNascimento());

        System.out.println("Paciente : "+this.getNome());
        System.out.println("Endereço : "+ this.getEndereco());
        System.out.println("CEP: "+this.getCEP());
        System.out.println("Telefone: "+this.getTelefone());
        System.out.println("Data de Nascimento: "+stringData);
        System.out.println("RG: "+this.getRG());
        System.out.println("CPF: "+this.getCPF());
        cidade.imprimirCidade();

    }

    public void listarPaciente (){
        System.out.println("|"+ this.getCPF());
        System.out.println("|"+ this.getNome());

    }


}
