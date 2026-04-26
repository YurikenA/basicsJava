package semana1_fundamentals;
import java.util.Scanner;

public class gestionInventario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Corregimos el tamaño del array
        String[] inventario = new String[3];

        System.out.println("--- Registro de Periféricos ---");

        for (int i = 0; i < inventario.length; i++) {
            System.out.printf("Ingrese el nombre del periférico %d: ",i+1);
            inventario[i] = teclado.nextLine();
            inventario[i] = inventario[i].strip();
            inventario[i] = inventario[i].toLowerCase();
        }

        System.out.println("Buscando Mouse...");
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].equals("mouse")) {
                System.out.printf("Mouse encontrado en la posición %d",i+1);
                break;
            }
            else{
                System.out.println("Mouse no encontrado");
            }
        }
        teclado.close();
    }
}
