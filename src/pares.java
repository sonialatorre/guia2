//Se pide representar el algoritmo que nos calcule la suma de los N primeros números pares
import java.util.Scanner;
//	Para N=0 Hasta N Con Paso 1 Hacer
//		Si N MOD 2 = 0 Entonces
//			escribir N;
//			X= X+N;
//		Fin Si
//	Fin Para
//	escribir "la suma es " X;
//FinAlgoritmo
public class pares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0, numero = 0;
        System.out.println("ingresa un numero");
        numero = scanner.nextInt();
        for (int i = 0; i < numero; i++) {
            if (i%2==0) {
                System.out.println(i);
                suma=suma+i;

            }
        }
        System.out.println(suma);
    }
}