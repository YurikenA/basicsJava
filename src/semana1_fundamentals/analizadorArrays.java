package semana1_fundamentals;
import java.util.Scanner;

public class analizadorArrays {
    public static void main(String[] args){
        //creamos un array de 5 elementos
        int[] latencia = new int[5];
        int suma = 0,promedio,numeroServidor=0,altaLatencia=0;
        int max = latencia[0];
        Scanner lectura = new Scanner(System.in);

        //ciclo para rellenar el array,sumar los elementos y determinar el mayor
        for(int i=0; i<=4; i++){
            String mensaje = String.format("Ingrese la latencia del servidor %d: ",i+1);
            System.out.print(mensaje);
            //guarda los valores en el array
            latencia[i] = lectura.nextInt();

            //contabiliza servidores con alta latencia
            if(latencia[i]>100){
                altaLatencia+=1;
            }
            //iniciamos sumatoria para el promedio
            suma+=latencia[i];
            //calculamos el numero mayor
            if(latencia[i] > max){
                max = latencia[i];
            }
        }
        lectura.close();
        promedio = suma/latencia.length;
        //localiza el servidor con mayor latencia
        for(int i=0; i<=4; i++){
            if(latencia[i]==max){
                numeroServidor = i+1;
            }
        }
        String servidorLento = String.format("La mayor latencia es de %dms en el servidor %d",max,numeroServidor);

        System.out.println("----------------------------------------");
        System.out.printf("El promedio de latencia es %dms %n",promedio);
        System.out.println(servidorLento);
        System.out.printf("Hay %d servidores con un latencia mayor a 100ms. La red puede ser lenta",altaLatencia);
    }
}
