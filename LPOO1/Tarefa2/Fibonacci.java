
import java.util.Scanner;

// Escreva um programa que tenha como entrada do usuário, através do teclado, um número inteiro positivo. Imprima a série de Fibonacci (0, 1 , 1,
// 2, 3, 5, 8, 13, 21, ...) até que o número da série seja maior que o número fornecido pelo usuário.

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer number;
        Integer previous;
        Integer atual = 0;
        Integer next = 1;

        System.out.println("\nDigite um numero inteiro positivo: ");
        number = scan.nextInt();

        System.out.println("\nSerie Fibonacci: ");

        while (atual < number) {
            
            System.out.print(atual + " ");

            previous = atual;
            atual = previous + next;
            next = previous;
        }

        scan.close();
    }
}
