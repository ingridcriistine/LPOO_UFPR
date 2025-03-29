// Construa um programa que leia os coeficientes de uma equação do segundo grau do teclado e mostre os valores de x da equação; 
//      a. Verifique na documentação Java as operações matemáticas da classe Math; 
//      b. Não é necessário validar tipos de raízes; 

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Float a, b, c, delta, x1, x2;
        
        System.out.println("\nDefina os coeficientes:");
        System.out.print(">> a = ");
        a = scan.nextFloat();
        System.out.print(">> b = ");
        b = scan.nextFloat();
        System.out.print(">> c = ");
        c = scan.nextFloat();

        delta = (float) (Math.pow(b, 2) -4*a*c);
        x1 = (-b - (float)Math.sqrt(delta)) / (2*a);
        x2 = (-b + (float)Math.sqrt(delta)) / (2*a);

        System.out.println("\nResultado: ");
        System.out.println("\n  x1: " + String.format("%.2f", x1));
        System.out.println("  x2: " + String.format("%.2f", x2));
    }
}
