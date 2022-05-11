package jogoVelhaAula33;

import java.util.Scanner;

public class JogoVelha33Principal {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        JogoVelha33 jogoVelha = new JogoVelha33();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;
        while (!ganhou){
            if (jogoVelha.vezJogador1()) {

                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
                sinal = 'X';
            } else {

                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
                sinal = 'O';
            }
            linha = valor("linha", sc)-1;
            coluna = valor("Coluna", sc)-1;

            if (!jogoVelha.validarJogada(linha, coluna, sinal)){
                System.out.println("Posição já usada, tente novamente");
            }

            jogoVelha.imprimirTabuleiro();

            if (jogoVelha.verGanhador('X')){
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            } else if (jogoVelha.verGanhador('O')){
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");

            } else if (jogoVelha.getJogada() > 9) {
                ganhou = true;
                System.out.println("Ninguém ganhou essa partida.");
            }
        }
    }
    public static int valor (String tipoValor, Scanner sc) {
        int valor = 0;
        boolean valorvalido = false;
        while (!valorvalido) {
            System.out.println("Entre com a "+tipoValor+" (1, 2 ou 3)");
            valor = sc.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorvalido = true;
            } else {
                System.out.println("Entrada inválida, tente novamente");
            }
        }
        return valor;
    }
}
