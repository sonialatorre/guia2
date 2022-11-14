import java.util.Scanner;

//determine el sueldo semanal de un trtabajador con base en las horas trabajadas y el pago x hora
//considerando que a partir de la hora 41 hasta la 45 cada hora se paga doble, de la 46 a la 50 triple
//trabajar mas de 50 horas no esta permitido
public class pagotrabajador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorhora = 100;

        System.out.println("ingrese cuántas horas trabajó en la semana");
        int horas = scanner.nextInt();

        if (horas >= 41 && horas <= 45) {
            System.out.println("su pago semanal es de " + valorhora * horas * 2);
        }
        if (horas >= 46 && horas <= 50){
            System.out.println("su pago semanal es de " + valorhora * horas * 3);
        }
        if (horas >= 50) {
            System.out.println("debe pasar por recursos humanos, el numero de horas trabajadas no está permitido");
        } if (horas<41){
            System.out.println("su pago semanal es de " + horas * valorhora);
        }
    }
}
