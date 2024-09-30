import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ejercicio;
        do {
            System.out.println("Ingrese la opcion:");
            System.out.println(
                    "1)Ejercicio 1 (). \n" +
                            "2)Ejercicio 2 (). \n" +
                            "3)Ejercicio 3 (). \n" +
                            "4)Ejercicio 4 (). \n" +
                            "5)Ejercicio 5 (). \n" +
                            "0)Salir ");
            ejercicio = scanner.nextInt();
            scanner.nextLine();

            switch (ejercicio) {

                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    Ejercicio5.Ej5(scanner);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Esto no es un ejercicio, intente de nuevo");
                    break;
            }

        } while (ejercicio != 0);
    }
}