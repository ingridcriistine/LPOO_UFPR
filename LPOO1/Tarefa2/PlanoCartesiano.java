// Construa um programa que leia do teclado dois pontos em um plano (x,y) e informe a distância entre eles.

import java.util.Scanner;

public class PlanoCartesiano {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer x1=0, x2=0, y1=0, y2=0, distance=0;

        System.out.println("\nPonto 1");
        System.out.print(">> X = ");
        x1 = scan.nextInt();
        System.out.print(">> Y = ");
        y1 = scan.nextInt();

        System.out.println("\nPonto 2");
        System.out.print(">> X = ");
        x2 = scan.nextInt();
        System.out.print(">> Y = ");
        y2 = scan.nextInt();

        distance = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("\nA distância entre os pontos é: " + distance);

        scan.close();

    }
}
