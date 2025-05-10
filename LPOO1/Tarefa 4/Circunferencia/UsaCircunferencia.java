import java.util.Scanner;

public class UsaCircunferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o raio da circunferencia 1: ");
        Double raio1 = scanner.nextDouble();

        Circunferencia c1 = new Circunferencia(raio1);
        System.out.println("Raio: " + c1.getRaio());
        System.out.println("Área: " + c1.calcularArea());

        System.out.print("\nDigite o raio da circunferencia 2: ");
        Double raio2 = scanner.nextDouble();

        Circunferencia c2 = new Circunferencia(raio2);
        System.out.println("\nRaio: " + c2.getRaio());
        System.out.println("Área: " + c2.calcularArea());
    }
}
