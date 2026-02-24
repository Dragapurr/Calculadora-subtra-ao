import java.util.Scanner;
public class CalculadoraSubtracao {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("==calculadora subtracao==");
System.out.print(" digite o primeiro numero: ");
double numero1 = scanner.nextDouble();
 System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = numero1 - numero2;

        System.out.println("Resultado: " + resultado);

        scanner.close();


    }
}

//oie 