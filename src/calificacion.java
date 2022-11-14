import javax.swing.*;
import java.util.Scanner;

//con base en una calificacion proporcionada (0-10) indique con letra la calificacion que corresponde
//10 es A 9 es B 8 es C 7y6 son D y de 5 a 0 es F
public class calificacion {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("ingresa la opción que corresponda a su calificación");
        System.out.println("1. Si su calificacion es 10 \n 2. Si su calificación es 9 \n 3. Si su calificación es 8 \n 4. Si su calificación es 6 ó 7, \n 5. Si su calificación se encuentra entre 0 y 5");
        int calificacion= scanner.nextInt();

        switch (calificacion){
            case 1:
                System.out.println("Su nota es A");
                break;
            case 2:
                System.out.println("Su nota es B");
                break;
            case 3:
                System.out.println("Su nota es C");
                break;
            case 4:
                System.out.println("Su nota es D");
                break;
            case 5:
                System.out.println("Su nota es E");
                break;

            default:
                System.out.println("ingrese un valor válido");

        }
    }
}
