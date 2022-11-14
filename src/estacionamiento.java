//determinar cuanto debe cobrar por el uso del estacionamiento,
// 2 primeras hrs 5 c/u, siguientes 3 4c/u, cinco siguientes 3c/u. despues de 10 hrs 2 c/u.

import javax.swing.*;
import java.util.Scanner;

public class estacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escriba el numero de horas que estuvo en el estacionamiento");
        int hora = scanner.nextInt();
        int total;
        if (hora <= 2) {
           total=hora*2;
        } if (hora<=5) {
            total=((hora-2)*4)+10;
        } if (hora<=10) {
            total = ((hora - 5) * 3) + 22;
        } else  {
            total=((hora - 10) *2) + 37;
        }
        System.out.println("el pago por el tiempo de estacionamiento es de "+ total);
    }

    }









