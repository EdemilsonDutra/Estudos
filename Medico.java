
import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.Scanner;
public class Medico {

    private int CRM;
    private String nome;

    public int getCRM(){
    return CRM;
    }
    public void setCRM(int CRM){
        this.CRM = CRM;
    }
    public String getNome (){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void cadastrar (){
        Scanner cad = new Scanner (System.in);
        System.out.println("Nome: ");
        this.setNome (cad.nextLine());
        System.out.println("CRM: ");
        this.setCRM (cad.nextInt());
    }

    public void imprimirDados (){
        System.out.println("Nome: "+ this.getNome());
        System.out.println("CRM: " + this.getCRM());
    }




}
