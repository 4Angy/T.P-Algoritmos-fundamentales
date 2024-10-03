import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ejercicio;
        do {
            System.out.println("Ingrese la opción:");
            System.out.println(
                    "1) Ejercicio 1 (No implementado). \n" +
                            "2) Ejercicio 2 (Algoritmo de Inserción). \n" +
                            "3) Ejercicio 3 (Algoritmo ASC DESC). \n" +
                            "4) Ejercicio 4 (No implementado). \n" +
                            "5) Ejercicio 5 (Ejercicio 5). \n" +
                            "0) Salir ");
            ejercicio = scanner.nextInt();
            scanner.nextLine();

            switch (ejercicio) {
                case 1:
                    break;
                case 2:
                    Ejercicio2.run(scanner);
                    break;
                case 3:
                    ejercicio3.run(scanner);
                    break;
                case 4:
                    break;
                case 5:
                    Ejercicio5.Ej5(scanner);
                    break;
                case 0:

                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }

        } while (ejercicio != 0);

        scanner.close();
    }
}
