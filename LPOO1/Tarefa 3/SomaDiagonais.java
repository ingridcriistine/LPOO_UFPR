// 12 - Escreva um programa que calcule a soma das diagonais principal e secundária. O programa deve perguntar ao 
// usuário a dimensão da matriz. Baseado na dimensão da matriz o programa deve pedir ao usuário para preencher os 
// valores da matriz (faça um método estático que receba a referência de uma matriz e a preencha). Com a matriz 
// preenchida faça outro método estático que calcule a soma das diagonais. Imprima o resultado. 

import java.util.Scanner;

public class SomaDiagonais {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int linhas = s.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int colunas = s.nextInt();

        if (linhas != colunas) {
            System.out.println("A matriz deve ser quadrada para calcular as diagonais.");
            return;
        }

        int[][] matriz = new int[linhas][colunas];

        preencherMatriz(matriz, s);
        imprimirMatriz(matriz);

        int somaPrincipal = somarDiagonalPrincipal(matriz);
        int somaSecundaria = somarDiagonalSecundaria(matriz);

        System.out.println("\nSoma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);
    }

    public static void preencherMatriz(int[][] matriz, Scanner s) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = s.nextInt();
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("\nMatriz:");
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print("[" + valor + "] ");
            }
            System.out.println();
        }
    }

    public static int somarDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        System.out.print("Diagonal principal: [");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + (i < matriz.length - 1 ? ", " : ""));
            soma += matriz[i][i];
        }
        System.out.println("]");
        return soma;
    }

    public static int somarDiagonalSecundaria(int[][] matriz) {
        int soma = 0;
        int n = matriz.length;
        System.out.print("Diagonal secundária: [");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][n - 1 - i] + (i < n - 1 ? ", " : ""));
            soma += matriz[i][n - 1 - i];
        }
        System.out.println("]");
        return soma;
    }
}
