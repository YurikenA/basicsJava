package semana1_fundamentals;
//incluye la herramienta de escaneo (lectura)
import java.util.Scanner;

//inicializa el archivo completo, crea el archivo
public class verificacionEdad {

    //inicializa el programa
    public static void main(String[] args){
        int numero = 1;
        float decimal = 1.5f;
        double decimalDoble = 80.50;
        String bienvenida = "Hola";

        System.out.print("Ingrese su nombre: ");
        //creamos el objeto encargado de leer
        Scanner lector = new Scanner(System.in);
        //creamos una variable y usamos el metodo del objeto
        String nombre = lector.nextLine();
        System.out.println(nombre);

        System.out.print("Ingrese su edad: ");
        int edad = lector.nextInt();
        System.out.println(edad);
        lector.close();

        //imprime numeros del 1 al 10 y detecta los numero pares
        for (int i=1; i<=10; i++){
            System.out.println(i);
            if(i%2 == 0){
                System.out.println("Numero par detectado");
            }
        }
        if(edad>=18){
            System.out.println("Estas autorizado");
        }
        else{
            System.out.println("No estas autorizado");
        }

    }
}
