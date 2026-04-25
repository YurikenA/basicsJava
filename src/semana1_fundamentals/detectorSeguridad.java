package semana1_fundamentals;
import java.util.Scanner;

public class detectorSeguridad {
    public static void main(String[] args){
        String ipAddress;
        String []ipBlocked={"192.168.1.10","10.0.0.5","92.168.138.32","12.178.125.43","138.0.0.51"};
        boolean accessDenied= false;
        Scanner lector= new Scanner(System.in);
        System.out.print("Ingrese su dirección IP para conectarse al servidor: ");
        ipAddress = lector.nextLine();
        lector.close();

        for(int i=0; i<=4; i++){
            if(ipAddress.equals(ipBlocked[i])){
                accessDenied= true;
                break;
            }
        }

        if(accessDenied){
            System.out.println("Acceso denegado a la IP: "+ipAddress);
        }
        else{
            System.out.println("Acceso concedido. Bienvenido al sistema");
        }
    }
}
