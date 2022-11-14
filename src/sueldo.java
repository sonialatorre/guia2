import java.util.Scanner;

//determinar el sueldo semanal de un trabajador con base en las horas trabajadas y pago por hora
//considerando que despues de las 40 horas cada hora se considera como excedente y se paga
//el doble.
public class sueldo {
    public static void main(String[] args) {
        int valorhora=10000;
        Scanner scan=new Scanner(System.in);
        System.out.println("ingrese el numero de horas trabajadas en la semana");
        int hora= scan.nextInt();
        if (hora<=40) {
            valorhora=valorhora*2;
            System.out.println("su pago semanal es de " +valorhora);
        }  else {
            valorhora=hora*valorhora;
            System.out.println("su pago semanal es de " +valorhora);
        }

    }
}
