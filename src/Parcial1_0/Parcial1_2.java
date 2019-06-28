package Parcial1_0;
import java.util.Scanner;
public class Parcial1_2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nom;
        int nota1,nota2,nota3,nota4;
        int promedio;


        System.out.println("Ingrese el nombre del alumno");
        nom = entrada.next();
        System.out.println("Ingrese nota1:");
        nota1 = entrada.nextInt();
        System.out.println("Ingrese nota2:");
        nota2 = entrada.nextInt();
        System.out.println("Ingrese nota3:");
        nota3 = entrada.nextInt();
        System.out.println("Ingrese nota4:");
        nota4 = entrada.nextInt();

        promedio =(nota1+nota2+nota3+nota4/4);

        if(promedio>=71)
        {
            System.out.println("FELICIDADES ERES UN BUEN ALUMNO");
            System.out.println("Promedio......"+promedio);

        }
        else{
            System.out.println("No");
        }





    }



}






