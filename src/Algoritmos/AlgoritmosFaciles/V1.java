package Algoritmos.AlgoritmosFaciles;

import java.util.Scanner;


public class V1 {
    //primero pensamos que usaremos en este caso tenemos que ver si un numero es par o no es decir una condicional cual? un if
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese un numero para ver si es par o impar");
        int paraOimapar=Integer.parseInt(entrada.nextLine());

        if (paraOimapar%2=0){
            System.out.println("este numero es impar");
        }
        else {
            System.out.println("es par");
        }
    }
}
