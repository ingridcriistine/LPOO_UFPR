// 11 - Construa um programa que calcule o determinante de uma matriz 3 x 3 fornecida pelo usuário;

import java.util.Scanner;

public class DeterminanteMatriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[][] matriz = new Integer[3][3];
        Integer diagonalPrincipal = 0;
        Integer diagonalSecundaria = 0;
        Integer determinante = 0;

        System.out.println("Defina os valores da matriz: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("L" + (i+1) + " x C" + (j+1) + " >> ");
                matriz[i][j] = scan.nextInt();
            }
        }
        
        for(int i = 0; i < 3; i++) {
            diagonalPrincipal *= matriz[i][i];
        }

        for(int i = 0; i < 3; i++) {
            int index = 2;
            diagonalSecundaria *= matriz[i][index];
            index--;
        }

        determinante = diagonalPrincipal - diagonalSecundaria;

        System.out.println(" ");
        System.out.println(" ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Determinante: " + determinante);
    }
}
