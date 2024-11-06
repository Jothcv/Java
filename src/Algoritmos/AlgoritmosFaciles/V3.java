package Algoritmos.AlgoritmosFaciles;

import java.util.Scanner;

public class V3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese el numero que quieres ver en factorial");
        int fact=Integer.parseInt(entrada.nextLine());
        int otro=factores(fact);
        System.out.println("tu numero en factorial es: "+otro);
    }

    public static int factores(int n){
        int factorial=1;
        for (int i=1;i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }

}
