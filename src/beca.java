import javax.swing.*;
import java.util.Scanner;

//para alumnos mayores de 18 años con promedio mayor o igual a 9 la beca sera de 2000
//con promedio mayor o igual a 7.5 de 1000. para los promedios menores de 7.5 pero mayores o iguales a 6 se les dara 100
//y a los alumnos con promedio menor de 6 se les enviara carta de invitación
public class beca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su edad");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("ingrese su promedio");
            float promedio = scanner.nextFloat();
            if (promedio >= 9) {
                System.out.println("su beca es de 2000");
            } else if (promedio >= 7.5) {
                System.out.println("su beca es de 1000");
            } else if (promedio < 7.5 && promedio >= 6) {
                System.out.println("su beca es de 100");
            } else {
                System.out.println("usted recibirá una carta de invitación");

                }

            }
        if (edad<18){
            System.out.println("usted no es elegible para beca");
        }
    }
        }




