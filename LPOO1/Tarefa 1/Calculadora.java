
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String calculadora;
        String[] argumentos;
        Float result = 0.0f;

        System.out.println("\nCalculadora: ");
        calculadora = scan.nextLine();

        argumentos = calculadora.split(" ");
        Float arg1 = Float.parseFloat(argumentos[0]);
        Float arg2 = Float.parseFloat(argumentos[1]);
        String op = argumentos[2];

        switch (op) {
            case "+":
                result = arg1 + arg2;
                break;
            case "-":
                result = arg1 - arg2;
                break;
            case "*":
                result = arg1 * arg2;
                break;
            case "/":
                if (arg2 != 0) {
                    result = arg1 / arg2;
                }
                else {
                    System.out.println("Impossível dividir por 0.");
                }
                break;
        }
         
        System.out.println("\nResultado: " + result);

        scan.close();
    }    
}
