package ej01;
        
import java.util.Scanner;
public class CalculadoraConsola {
    public static void main (String args[]) {


        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2;

        do {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Función Seno");
            System.out.println("6. Función Coseno");
            System.out.println("7. Función Tangente");
            System.out.println("8. Potencia n-ésima");
            System.out.println("9. Calcular porcentaje IVA");
            System.out.println("10. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n***SUMA*");
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("\n***RESTA*");
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("\n***MULTIPLICACIÓN*");
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("\n***DIVISIÓN*");
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: División por cero");
                    }
                    break;
                case 5:
                    System.out.println("\n***FUNCIÓN SENO*");
                    System.out.print("Ingrese un número: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Resultado: " + Math.sin(num1));
                    break;
                case 6:
                    System.out.println("\n***FUNCIÓN COSENO*");
                    System.out.print("Ingrese un número: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Resultado: " + Math.cos(num1));
                    break;
                case 7:
                    System.out.println("\n***FUNCIÓN TANGENTE*");
                    System.out.print("Ingrese un número: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Resultado: " + Math.tan(num1));
                    break;
                case 8:
                    System.out.println("\n***RAIZ ENESIMA*");
                    System.out.print("Ingrese el radicando: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el índice de la raíz: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Resultado: " + Math.pow(num1, 1.0 / num2));
                    } else {
                        System.out.println("Error: Índice de raíz no puede ser cero");
                    }
                    break;
                case 9:
                    System.out.println("\n***CALCULO IVA*");
                    System.out.print("Ingrese el valor: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el porcentaje de IVA a cobrar: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 * (num2 / 100)));
                    break;
                case 10:
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
            System.out.println();
        } while (opcion != 10);

        scanner.close();
    }    
}
    

