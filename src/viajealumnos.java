import java.util.Scanner;

//cuanto costara el pasaje . si son mas de 100 alumn costo 20 si son entre 50 y 100 35
//si son entre 20 y 49 40 si son menos de 20 70
public class viajealumnos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("ingrese el numero de alumnos que viajarán");
        int alumnos=scanner.nextInt();
        if (alumnos >100) {
            System.out.println("el costo total del viaje de los " + alumnos + " alumnos, es de  " + alumnos * 20);
        }
        if (alumnos>50&&alumnos<100){
            System.out.println("el costo total del viaje de los " + alumnos + " alumnos, es de  " + alumnos * 35);
        }
        if (alumnos>20&&alumnos<49){
            System.out.println("el costo total del viaje de los " + alumnos + " alumnos, es de  " + alumnos * 40);
        }
        if (alumnos<20){
            System.out.println("el costo total del viaje de los " + alumnos + " alumnos, es de  " + alumnos * 70);
        }
    }
}
