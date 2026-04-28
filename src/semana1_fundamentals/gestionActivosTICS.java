package semana1_fundamentals;
import java.util.Scanner;
public class gestionActivosTICS {
    public static void main(String[] args){
        Scanner lector= new Scanner(System.in);
        String []nombresEquipo= new String[5];
        String equipoBuscado;
        String equipoPremium = "null";
        double []precios= new double[5];
        double max=0,suma=0;
        boolean equipoEncontrado= false;

        for(int i=0; i < nombresEquipo.length; i++) {
            System.out.printf("%nIngrese el nombre del equipo %d: ",i+1);
            nombresEquipo[i] = lector.nextLine();
            nombresEquipo[i] = nombresEquipo[i].strip();
            System.out.printf("Ingrese el precio del equipo: ");
            precios[i] = lector.nextDouble();
            lector.nextLine();

            suma+=precios[i];
            if(precios[i] > max){
                max = precios[i];
                equipoPremium = nombresEquipo[i];
            }
        }

        System.out.printf("%n---Registro de activos---%n");
        for(int i=0; i < nombresEquipo.length && i < precios.length; i++) {
            System.out.printf("Equipo %d: %s | Precio: %.2f %n",i+1,nombresEquipo[i],precios[i]);
        }
        System.out.printf("%n---Reporte final---%n");
        System.out.printf("Total inversión: %.2f %n",suma);
        System.out.printf("Equipo premium: %s - %.2f %n",equipoPremium,max);

        System.out.print("Ingrese el equipo a buscar: ");
        equipoBuscado = lector.nextLine();
        equipoBuscado = equipoBuscado.strip();
        for(int i=0; i < nombresEquipo.length; i++){
            if(equipoBuscado .equalsIgnoreCase(nombresEquipo[i])){
                System.out.print("Equipo localizado en almacen");
                equipoEncontrado = true;
                break;
            }
        }
        if(!equipoEncontrado){
            System.out.print("Equipo no encontrado");
        }
        lector.close();
    }
}
