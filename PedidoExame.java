/*package desenvolvimento;*/
import static desenvolvimento.Programa.c;
import static desenvolvimento.Programa.m;
import static desenvolvimento.Programa.p;
import static desenvolvimento.Programa.contC;
import static desenvolvimento.Programa.contM;
import static desenvolvimento.Programa.contP;

import java.util.Scanner;
public class PedidoExame {
    private int codigo;
    private paciente paciente = new paciente();
    private medico medico = new medico ();
    private convenio convenio = new convenio();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(paciente paciente) {
        this.paciente = paciente;
    }

    public medico getMedico() {
        return medico;
    }

    public void setMedico(medico medico) {
        this.medico = medico;
    }

    public convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(convenio convenio) {
        this.convenio = convenio;
    }

    public void cadastrar (){
        Scanner cad = new Scanner(System.in);
        int cadPaciente, codMedico, codConvenio;
        System.out.println("---------------------------------");
        System.out.println("Relação de Pacientes");
        System.out.println("Codigo | CPF           |  Nome");
        for (int i; i<contP; i++){
            System.out.println("          "+i);
            p[i].listarPaciente();
            System.out.println();

        }
        System.out.println("Escolha um Paciente: ");
        cadPaciente = cad.nextInt();
        this.setPaciente(p[codPaciente]);
        cad.nextLine();

        System.out.println("----------------------------------");
        System.out.println("Relação de Médicos");
        System.out.println("Código      |CRM    | Nome  ");
        for (int i = 0; i<contM; i++){
            System.out.println("        "+i);
            m.[i].listarMedico();
            System.out.println();
        }
        System.out.println("Escolha um Médico: ");
        codMedico = cad.nextInt();
        this.setMedico(m[codMedico]);
        cad.nextLine();

        System.out.println("-----------------------------------");
        System.out.println("Relação de Convênios: ");
        System.out.println("Código | Nome");
        for(int i = 0; i < contC; i++){
            System.out.print(" "+i);
            c[i].imprimirConvenio();
            System.out.println();
        }
        System.out.println("Escolha um convênio");
        codConvenio = cad.nextInt();
        this.setConvenio(c[codConvenio]);
        cad.nextLine();
    }
    public void imprimirPedidoExame(){
        System.out.println("Médico: "+this.getMedico().getNome());
        System.out.println("Convênio: "+this.getConvenio().getNome());
        System.out.println("Paciente: "+this.getPaciente().getNome());
    }


}





