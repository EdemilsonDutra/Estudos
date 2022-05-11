import java.util.Scanner;

public class voo {
    double mediaLitrosPorKm;
    double capacidadeMaxTanque;
    double kmTrechoPlanejado;
    double kmTrechoAlternativo;
    double quantidadeCombNoTanque;
    double quantidadeCombNecessaria;

    public voo(double mediaLitrosPorKm, double capacidadeMaxTanque, double kmTrechoPlanejado,
               double kmTrechoAlternativo, double quantidadeCombNoTanque, double quantidadeCombNecessaria) {
        this.mediaLitrosPorKm = mediaLitrosPorKm;
        this.capacidadeMaxTanque = capacidadeMaxTanque;
        this.kmTrechoPlanejado = kmTrechoPlanejado;
        this.kmTrechoAlternativo = kmTrechoAlternativo;
        this.quantidadeCombNoTanque = quantidadeCombNoTanque;
        this.quantidadeCombNecessaria = quantidadeCombNecessaria;
    }

    public double getMediaLitrosPorKm() {
        return mediaLitrosPorKm;
    }

    public void setMediaLitrosPorKm(double mediaLitrosPorKm) {
        this.mediaLitrosPorKm = mediaLitrosPorKm;
    }

    public double getCapacidadeMaxTanque() {
        return capacidadeMaxTanque;
    }

    public void setCapacidadeMaxTanque(double capacidadeMaxTanque) {
        this.capacidadeMaxTanque = capacidadeMaxTanque;
    }

    public double getKmTrechoPlanejado() {
        return kmTrechoPlanejado;
    }

    public void setKmTrechoPlanejado(double kmTrechoPlanejado) {
        this.kmTrechoPlanejado = kmTrechoPlanejado;
    }

    public double getKmTrechoAlternativo() {
        return kmTrechoAlternativo;
    }

    public void setKmTrechoAlternativo(double kmTrechoAlternativo) {
        this.kmTrechoAlternativo = kmTrechoAlternativo;
    }

    public double getQuantidadeCombNoTanque() {
        return quantidadeCombNoTanque;
    }

    public void setQuantidadeCombNoTanque(double quantidadeCombNoTanque) {
        this.quantidadeCombNoTanque = quantidadeCombNoTanque;
    }

    public double getQuantidadeCombNecessaria() {
        return quantidadeCombNecessaria;
    }

    public void setQuantidadeCombNecessaria(double quantidadeCombNecessaria) {
        this.quantidadeCombNecessaria = quantidadeCombNecessaria;
    }

    public void CalcularTrecho () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a media de lt/km feitos pela aeronave");
        this.setMediaLitrosPorKm (sc.nextDouble());
        System.out.println("Entre com a capacidade de litros do tanque");
        this.setCapacidadeMaxTanque(sc.nextDouble());
        System.out.println("Entre com a quantidade de quilometros do trecho planejado");
        this.setKmTrechoPlanejado(sc.nextInt());
        System.out.println("Entre com a quantidade de quilometros do trecho alternativo");
        this.setKmTrechoAlternativo(sc.nextDouble());
        System.out.println("Entre com a quantidade de combustivel já presente no tanque");
        this.setQuantidadeCombNoTanque(sc.nextDouble());

        this.setQuantidadeCombNecessaria((this.getKmTrechoPlanejado()+this.getKmTrechoAlternativo()+
                ((this.getKmTrechoPlanejado()+this.getKmTrechoAlternativo())/10)*3)*this.getMediaLitrosPorKm());

        if (this.getQuantidadeCombNecessaria()<this.getCapacidadeMaxTanque()){
            System.out.println("Bom voo");
            System.out.println(this.getQuantidadeCombNecessaria());
        } else{
            System.out.println("Voo reprovado por falta de combustivel");
            System.out.println(this.getQuantidadeCombNecessaria());
        }
    }
}
