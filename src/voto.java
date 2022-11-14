import java.util.Scanner;

//determine si una persona puede votar con base en su edad.
public class voto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad");
        edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Usted puede votar en las próximas elecciones");
        }else {
            System.out.println("Usted no puede votar en las próximas elecciones");

        }
    }
}
