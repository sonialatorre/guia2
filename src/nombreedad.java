//se tiene el nombre y la edad de tres personas. se desea saber el nombre y edad de la persona
//de menos edad.
import javax.swing.*;
import java.util.Scanner;

public class nombreedad {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese el nombre de la primer persona");
        String persona1= scanner.next();
        System.out.println("ingrese la edad de la primer persona");
        int edad1= scanner.nextInt();
        System.out.println("ingrese el nombre de la segunda persona");
        String persona2= scanner.next();
        System.out.println("ingrese la edad de la segunda persona");
        int edad2= scanner.nextInt();
        System.out.println("ingrese el nombre de la tercera persona");
        String persona3= scanner.next();
        System.out.println("ingrese la edad de la segunda persona");
        int edad3= scanner.nextInt();

        if (edad1<edad3) {
            System.out.println("la persona con menor edad es " + persona1 + "que tiene " + edad1 + "años");
        }else if(edad2<edad3) {
                System.out.println("la persona con menor edad es " + persona2 + "que tiene " + edad2 + "años");
        }else {
            System.out.println("la persona con menor edad es " + persona3 + " que tiene " + edad3 + " años");
        }

            }
        }


