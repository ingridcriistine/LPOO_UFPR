// Implemente um programa que calcule o bônus anual de um funcionário de uma empresa. O programa pede para o usuário os seguintes dados: Cargo do 
// funcionário e salário atual. Se o cargo for diretor o sistema pede quantidade de departamentos gerenciados. Se o cargo for gerente o sistema pede a quantidade 
// de pessoas gerenciadas. Não é necessário fazer tratamento de entrada de dados. 
// O cálculo do bônus anual segue as seguintes regras. 
//      a. Para Diretor: 
//          i. 4 salários + R$3000,00 por departamento gerenciado 
//      b. Para Gerente 
//          i. 2 salários + R$100,00 por pessoa gerenciada 
//      c. Analista 
//          i. 1 salário 
//      d. Programador 
//          i. 0,8 salário 
//      e. Auxiliar de Limpeza 
//          i. 0,5 salário

import java.util.Scanner;

public class BonusFuncionario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Float salario;
        Float bonus = 0.0f;
        Integer cargo, qtdDepartamento, qtdPessoas;

        System.out.println("\nCargos: ");
        System.out.println("1 - Diretor ");
        System.out.println("2 - Gerente ");
        System.out.println("3 - Analista ");
        System.out.println("4 - Programador ");
        System.out.println("5 - Auxiliar de Limpeza ");

        System.out.print("\nDigite o seu cargo: ");
        cargo = scan.nextInt();

        System.out.print("Digite o seu salário atual: ");
        salario = scan.nextFloat();

        switch (cargo) {
            case 1:
                System.out.print("Digite a quantidade de departamentos gerenciados: ");
                qtdDepartamento = scan.nextInt();
                bonus = (4 * salario) + (3000 * qtdDepartamento);
                break;
            case 2:
                System.out.print("Digite a quantidade de pessoas gerenciadas: ");
                qtdPessoas = scan.nextInt();
                bonus = (2 * salario) + (100 * qtdPessoas);
                break;
            case 3:
                bonus = salario;
                break;
            case 4:
                bonus =  0.8f * salario;
                break;
            case 5:
                bonus = 0.5f * salario;
                break;
            default:
                break;
        }

        System.out.print("\nValor do bônus anual: R$ " + String.format("%.2f", bonus));
    }
}
