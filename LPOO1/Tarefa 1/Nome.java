
//(Tarefa 01) Crie um programa “Nome” que leia um nome completo na linha de comando e imprima-o ao contrário.  
//Por exemplo, a linha de comando java Nome Rafael Wandresen deve imprimir: 
//Wandresen 
//Rafael 

import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;

        System.out.println("\nDigite seu nome completo: ");
        nome = scan.nextLine();

        String[] nomeCompleto = nome.split(" ");
        System.out.println("\n");

        for (int i = nomeCompleto.length - 1; i >= 0; i--) {
            System.err.println(nomeCompleto[i]);
        }

        scan.close();
    }
}