//Faça uma classe executável que dados a quantidade de DVDs que uma vídeo locadora possui e o valor que ela cobra por cada aluguel, informe: 
// a. Sabendo que um terço dos DVDs são alugadas por mês, o seu faturamento anual. 
// b. Sabendo que quando o cliente atrasa a entrega, é cobrada uma multa de 10% sobre o valor do aluguel e que um décimo das fitas alugadas no 
//    mês são devolvidas com atraso, o valor ganho com multas por mês. 
// c. Formate a saída para aparecer com duas casas decimais e (R$) na frente. 
// d. Faça comentários na classe e gere o JavaDoc. 

/**
 * A classe Locadora calcula o faturamento anual e os ganhos com multas mensais
 * de uma locadora de DVDs.
 * 
 * @author Ingrid Rocha
*/

import java.util.Scanner;

public class Locadora {
    /**
     * Método principal que executa os cálculos de faturamento e multas.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer qtd;
        Float aluguel, faturamentoAnual, multasMensais, faturamentoMensal;

        // Inputs necessários para fazer os cálculos
        System.out.print("\nInforme a quantidade de DVDs: ");
        qtd = scan.nextInt();
        System.out.print("Informe o valor do aluguel: ");
        aluguel = scan.nextFloat();

         // Cálculo de faturamento.
        faturamentoMensal = (qtd / 3) * aluguel;
        faturamentoAnual = faturamentoMensal * 12;

        // Cálculo de multa.
        multasMensais = (((qtd / 3) / 10) * aluguel) * 0.1f;

        System.out.println("\nFaturamento anual: R$ " + String.format("%.2f", faturamentoAnual));
        System.out.println("Ganho com multas por mês: R$ " + String.format("%.2f", multasMensais));
    }
}
