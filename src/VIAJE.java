import java.util.Scanner;

//determinar a que lugar podra ir de vacaciones una persona considerando que la linea de autobuses
//cobra por km recorrido. se debe considerar el costo de pasaje tanto de ida como de vuelta. datos fijos:
//mexico 730 km pv 800 km, acapulco 1200km cancun 1800 km
public class VIAJE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el lugar al que viajará según las siguientes opciones:\n 1 méxico \n 2 acapulco \n 3 cancun \n 4 PV");
        int lugar = scanner.nextInt();
        int pagopasaje;

        if (lugar == 1) {
            System.out.println("el costo de su pasaje de ida y regreso es de " + (730 * 50 * 2));
        } if (lugar == 4) {
            System.out.println("el costo de su pasaje de ida y regreso es de " + (800 * 50 * 2));
        }  if (lugar == 2) {
            System.out.println("el costo de su pasaje de ida y regreso es de " + (1200 * 50 * 2));
        }  if (lugar == 3) {
            System.out.println("el costo de su pasaje de ida y regreso es de " + (1800 * 50 * 2));
        }
        }

    }








