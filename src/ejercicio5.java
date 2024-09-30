import java.util.Scanner;

public class Ejercicio5 {
    
    public static void Ej5(Scanner scanner){
        int filas,columnas;
        int promedio=0,resultado=0;
        do{
         System.out.println("Ingrese un numero igual o mayor a 2");
         filas=scanner.nextInt();
         scanner.nextLine();
         System.out.println("Ingrese un numero igual o mayor a 2");
         columnas=scanner.nextInt();
         scanner.nextLine();
        }while ( filas<2 || columnas <2);
        int[][] arreglo = new int[filas][columnas];
        System.out.println("Ingrese los numeros del arreglo de "+filas+" x "+columnas);
        for(int i = 0;i < filas;i++){
            for(int j = 0;j < columnas;j++){
             arreglo[i][j] = scanner.nextInt();
            }
        }System.out.println("\n");
        System.out.println("Matriz:");
        for(int i = 0;i < filas;i++){
            for(int j = 0;j < columnas;j++){
             System.out.print(arreglo[i][j] + " ");
            }
         System.out.print("\n");
        }
        for(int i = 0;i < filas;i++){
            for(int j = 0;j < columnas;j++){
             promedio+=arreglo[i][j];
            }
        }
        resultado=promedio/(filas*columnas);
        System.out.println("El promedio de la matriz es : "+resultado);
        for(int i = 0;i < filas;i++){
            for(int j = 0;j < columnas;j++){
                if (arreglo[i][j]==resultado){
                 System.out.println("El numero "+resultado+" se encuentra en la fila "+(i+1)+" ,columna "+(j+1));
                }
            }
        }
    }
}