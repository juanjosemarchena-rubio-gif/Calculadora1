/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juan José Marchena
 */
public class Calculadora1 {
    import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Bienvenido a la calculadora");
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;

            case '-':
                resultado = num1 - num2;
                break;

            case '*':
                resultado = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: no se puede dividir entre cero.");
                    scanner.close();
                    return;
                }
                resultado = num1 / num2;
                break;

            default:
                System.out.println("Operación no válida.");
                scanner.close();
                return;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}

}
