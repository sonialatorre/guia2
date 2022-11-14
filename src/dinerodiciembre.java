import java.util.Scanner;

public class dinerodiciembre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el monto de dinero que recibirá en diciembre");
        int dinero = scanner.nextInt();
        if (dinero >= 50000) {
            System.out.println("usted podrá comprar el paquete A");
        }
        if (dinero < 50000 && dinero >= 20000) {
            System.out.println("usted podrá comprarse el paquete B");
        }
        if (dinero < 20000 && dinero >= 10000) {
            System.out.println("usted podrá comprarse el paquete c");
        }

    }
}