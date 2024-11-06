package Algoritmos.Ejerciciso;

import java.util.Scanner;

public class EV2 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingresa tu numero paraa ver su factorial: ");
        int fac=Integer.parseInt(entrada.nextLine());
        int fact=fact(fac);
        System.out.println("El factorial de un numero es: "+ fact);
    }

    public static int fact(int x){
        int factorial=1;
        for (int i=1;i<=x;i++){
            factorial*=i;
        }
        return factorial;
    }
}
