//2 tipos de poliza. A: cobertura amplia. B. daños a terceros. Plan A cuota base de 1200 y para el B. 950
//10% cargo si consume alcohol. 5% tiene lentes. 5%. diabetes o insuficiencia cardiaca
// y si tiene mass de 40 años 20%, de lo contrario solo 10%. todo sobre el costo base.

import java.util.Scanner;

public class seguros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el tipo de póliza que desea tomar.   8:  para poliza A de cobertura amplia y 9 para poliza B de cobertura a terceros");
        int tipopoliza = scanner.nextInt();

        System.out.println("responda el siguiente cuestinario según la opción que corresponde \n" +
                " escriba 1. si ud tiene como hábito consumir alcohol \n escriba 2. si ud usa lentes \n" +
                "  escriba 3. si ud sufre de diabetes o insufuciencia cardiaca \n" +
                " escriba 4. Si usted tiene mas de 40 años \n" +
                " escriba 5 si no tiene ninguna de las anteriores características");
        int condiciones = scanner.nextInt();


        if (tipopoliza == 8) {

            switch (condiciones) {

                case 1:
                    System.out.println("el valor a pagar por su póliza es de " + (1250 *.10 + 1250));
                    break;
                case 2:
                    System.out.println("el valor a pagar por su póliza es de " + (1250 * .5 + 1250));
                    break;
                case 3:
                    System.out.println("el valor a pagar por su póliza es de " + (1250 * .5 + 1250));
                    break;
                case 4:
                    System.out.println("el valor a pagar por su póliza es de " + (1250 * .20 +1250));
                    break;
                case 5:
                    System.out.println("el valor a pagar por su póliza es de " + (1250 *.10+1250));
                    break;


            }

        }if (tipopoliza == 9) {

            switch (condiciones) {

                case 1:
                    System.out.println("el valor a pagar por su póliza es de " + (950 * .10 + 950));
                    break;
                case 2:
                    System.out.println("el valor a pagar por su póliza es de " + (950 * .5+ 950));
                    break;
                case 3:
                    System.out.println("el valor a pagar por su póliza es de " + (950 * .5+ 950));
                    break;
                case 4:
                    System.out.println("el valor a pagar por su póliza es de " + (950 * .20 + 950));
                    break;
                case 5:
                    System.out.println("el valor a pagar por su póliza es de " + (950 * .10 + 950));
                    break;
            }

        }
    }
        }











