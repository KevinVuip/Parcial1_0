package Parcial1_0;
import java.util.Scanner;
public class Parcial1_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de trajes:");
        int num = sc.nextInt();

        int valor = num * 100;
        int dcto  = 0;
        if(num < 5){
            dcto = (int) ( valor*0.5);
        }else if(num >=1 && num <5){
            dcto=(int)(valor*0.55);
        }else{
            dcto = (int)(valor*0.65);
        }


        System.out.println(" El valor a pagar es:"+(valor -dcto));


    }
}




