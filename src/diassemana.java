import java.util.Scanner;

//con base en un numero proporcionado (1-7) indique el dia de la semana que corresponde
public class diassemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba un número del 1 al 7");
        int dia = scanner.nextInt();

        if (dia == 1) {
            System.out.println("lunes corresponde al día 1");
        }

        if (dia == 2) {
            System.out.println("martes corresponde al día 2");
        }

        if (dia == 3) {
            System.out.println("miercoles corresponde al día 3");
        }

        if (dia == 4) {
            System.out.println("jueves corresponde al día 4");
        }

        if (dia == 5) {
            System.out.println("viernes corresponde al día 5");
        }

        if (dia == 6) {
            System.out.println("sabado corresponde al día 6");
        }

        if (dia == 7) {
            System.out.println("domingo corresponde al día 7");
        }
    }
}



