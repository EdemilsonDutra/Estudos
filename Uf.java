
import java.util.Scanner;

public class Uf {
    private String nome;
    private String sigla;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public void cadastrar(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Estado: ");
        this.setNome(tec.nextLine());
        System.out.println("Sigla: ");
        this.setSigla(tec.nextLine());

    }

    public void imprimirUf(){
        System.out.println("Estado: "+ this.getNome());
        System.out.println("Sigla: "+ this.getSigla());


    }

}
