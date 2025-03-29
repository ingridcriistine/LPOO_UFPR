// Faça uma classe executável que dados a distância percorrida (em Km) e o tempo gasto em uma viagem (em horas), informe a velocidade 
// média do carro, sabendo que Velocidade = S / T (variação de distância / variação do tempo). Imprima o valor com duas casas decimais. 

import java.util.Scanner;

public class VelocidadeMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Float distance, hours, velocidade;

        System.out.print("\nInforme a distância percorrida (em Km): ");
        distance = scan.nextFloat();
        System.out.print("Informe o tempo gasto (em horas): ");
        hours = scan.nextFloat();

        velocidade = distance / hours;

    System.out.println("\nVelocidade média: " + String.format("%.2f", velocidade) + " km/h");
    }
}
