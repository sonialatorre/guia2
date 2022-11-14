import java.util.Scanner;

//se otorgara un bono de desempeño a todos los profesores con base en su puntuacion:
//0-100 1 salario, 101-150 2 salarios minim, 151 en adelante 3 salarios minimos.
//determine el monto del bono que recibirá el profesor capturando el salario minimo y los puntos del profesor
public class bonodesempeño {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    int salariominimo=1000000;
        System.out.println("ingrese la calificacion del profesor");
        int calificacion= scanner.nextInt();

        if(calificacion<=100){
            System.out.println("su bono de desempeño será de "+ salariominimo);
        }
        if (calificacion>=101&&calificacion<=150){
            System.out.println("su bono de desempeño será de " + salariominimo*2);
        }
        if (calificacion>=151){
            System.out.println("Su bono de desempeño será de " + salariominimo*3);

        }
    }
}
