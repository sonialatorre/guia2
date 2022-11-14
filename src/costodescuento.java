import java.util.Scanner;

//determinar el costo y descuento que tendra un articulo.
//si su precio es mayor o igual a $200 el dto es del 15%.
// si es mayor a 100 pero menor a 200 el dcto es de 12%
// y si es menor a $100, solo 10%
public class costodescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el precio del artículo");
        int precio = scanner.nextInt();
        float descuento=0;
        float preciototal=0;
        preciototal=precio-descuento;

        if (precio >= 200) {
           descuento = precio * 15 / 100;
            System.out.println("el descuento por su prenda es de " + descuento + "y el valor total a pagar es de " + (preciototal=precio-descuento));

        } else if (precio > 100 && precio < 200) {
            descuento = precio * 12 / 100;
            preciototal=precio-descuento;
            System.out.println("el descuento por su prenda es de " + descuento + "y el valor total a pagar es de " + preciototal);
        }else{
                    descuento = precio * 10 / 100;
           preciototal=precio-descuento;
                    System.out.println("el descuento por su prenda es de " + descuento + "y el valor total a pagar es de " + preciototal);

                }
            }
        }




