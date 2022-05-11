
import static desenvolvimento.Programa.contGe;
import static desenvolvimento.Programa.ge;
import java.util.Scanner;
public class Exame {
    private int codigo;
    private String Descricao;
    private double valor;
    private String procedimentos;
    private GrupoExame grupoExame = new GrupoExame();
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return Descricao;
    }
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getProcedimentos() {
        return procedimentos;
    }
    public void setProcedimentos(String procedimentos) {
        this.procedimentos = procedimentos;
    }

    public GrupoExame getGrupoExame() {
        return grupoExame;
    }
    public void setGrupoExame(GrupoExame grupoExame) {
        this.grupoExame = grupoExame;
    }
    public void cadastrar(){
        Scanner cad = new Scanner(System.in);
        int codGrupoExame;
        System.out.println("----------------------");
        System.out.println("Relação dos Grupos");
        System.out.println("Código | Grupos");
        for(int i = 0; i < contGe; i++){
            System.out.print(" "+i);
            ge[i].listarGrupoExame();
            System.out.println();
        }
        System.out.println("Vincule a um grupo");
        codGrupoExame = cad.nextInt();
        this.setGrupoExame(ge[codGrupoExame]);
        cad.nextLine();
        System.out.println("Código: ");
        this.setCodigo(cad.nextInt());
        cad.nextLine();

        System.out.println("Exame");
        this.setDescricao(cad.nextLine());
        System.out.println("Valor");
        this.setValor(cad.nextDouble());
        cad.nextLine();
        System.out.println("Procedimentos");

        this.setProcedimentos(cad.nextLine());
    }
    public void imprimirExame(){
        System.out.println("Código.........: "+this.
                getCodigo());
        System.out.println("Exame..........: "+this.
                getDescricao());
        System.out.println("Grupo do Exame.: "+this.
                getGrupoExame().getDescricao());
        System.out.println("Valor..........: "+this.
                getValor());
        System.out.println("Procedimentos..: "+this.
                getProcedimentos());
        System.out.println("-------------------");
    }
}
