import java.util.Scanner;

//se les dara un bono por antigüedad a los empleados. Si tienen 1 año $100 2 años $200 y asi sucesivamente hasta los 5 años.
//para los que tengan mas de 5 sera de 1000
public class bonoantig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese cuantos años de antigüedad tiene en la empresa");
        int antigüedad = scanner.nextInt();
        if (antigüedad == 1) {
            System.out.println("el bono que usted recibirá es de " + 100);
        }
        if (antigüedad == 2) {
            System.out.println("el bono que usted recibirá es de " + 200);
        }
        if (antigüedad == 3) {
            System.out.println("el bono que usted recibirá es de " + 300);
        }
        if (antigüedad == 4) {
            System.out.println("el bono que usted recibirá es de " + 400);
        }
        if (antigüedad == 5) {
            System.out.println("el bono que usted recibirá es de " + 500);
        }
        if (antigüedad >= 5) {
            System.out.println("el bono que usted recibirá es de " + 1000);
        }

    }
}

