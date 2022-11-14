import java.util.Scanner;

//el 14 de febrero una persona desea comprar un regalo a un ser querido , su dilema radica en qué
//regalo puede hacerle , las alternativas que tiene son:
//tarjeta 10 o menos, chocolates 11 a 100, flores 101 a 250, anillo mas de 25.
public class regalosanvalentin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("elija la opción que corresponda: \n 1. si su presupuesto es de 10 o menos \n 2. si su presupuesto esta entre 11 y 100 \n 3. si su presupuesto está entre 101 y 250 \n 4. si su presupuesto es mayor de 251 ");
        int presupuesto= scanner.nextInt();
       switch (presupuesto){
           case 1:
               System.out.println("la alternativa para su presupuesto es una tarjeta");
               break;
           case 2:
               System.out.println("la alternativa para su presupuesto es una caja de chocolates");
               break;
           case 3:
               System.out.println("la alternativa para su presupuesto son unas flores");
               break;
           case 4:
               System.out.println("la alternativa para su presupuesto es un anillo");
               break;

           default:
               System.out.println("ingrese una opción valida");
        }
    }
}
