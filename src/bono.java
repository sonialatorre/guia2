import java.util.Scanner;

public class bono {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int salario=0;
        double bonoantigüedad = 0;
        double bonosalario=0;
        double bonomensual=0;
        System.out.println("ingrese cual es su antigüedad en la empresa");
        int antigüedad= scanner.nextInt();
        System.out.println("ingrese su salario");
         salario=scanner.nextInt();

        if (antigüedad >2&& antigüedad<5){
          bonoantigüedad=salario*0.2;
        }
if (antigüedad>=5){
    bonoantigüedad=salario*0.3;

}
if (salario<=1000){
    bonosalario=salario*0.25;
        }
        if (salario>1000&&salario<=3500){
            bonosalario=salario*0.15;
        }
        if (salario>3500){
            bonosalario=salario*0.1;
    }
        if (bonoantigüedad>bonosalario) {
            bonomensual = bonoantigüedad;
            System.out.println("el bono que recibirá es el bono por antigüedad");
        }else {
            System.out.println("el bono que recibirá es el bono por salario");
            bonomensual=bonosalario;

        }
        System.out.println("el valor del bono mensual es " + bonomensual);

        }

}
