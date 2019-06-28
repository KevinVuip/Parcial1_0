   package Parcial1_0;
   import java.util.*;
   public class Parcial1_1 {

    public static void main(String[] args) {

            Scanner leer=new Scanner(System.in);
            System.out.println("Introduzca el costo del metro cuadrado: ");

            double metro=leer.nextInt();
            System.out.println("Introduzca la altura del terreno: ");

            double altura=leer.nextInt();
            System.out.println("Introduzca la base del terreno: ");
            double base=leer.nextInt();


            double res=(altura*base);
            double resultado=(res*metro);

            System.out.println("El total a pagar por el terreno es :$"+resultado);



        }

    }





