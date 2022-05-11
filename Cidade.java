
import java.util.Scanner;
public class Cidade {
    private String nome, ddd;
    private Uf uf = new Uf();

    public String getDdd(){
        return ddd;
    }
    public void setDdd(String ddd){
        this.ddd = ddd;
    }
    public Uf getUf() {
        return uf;
    }
    public void setUf(Uf uf) {
        this.uf = uf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrar(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Cidade: ");
        this.setNome(tec.nextLine());
        System.out.println("DDD: ");
        this.setDdd(tec.nextLine());
        uf.cadastrar();

    }

    public void imprimirCidade(){
        System.out.println("Cidade: "+ this.getNome());
        System.out.println("DDD: "+ this.getDdd());
        uf.imprimirUf();

    }

}
