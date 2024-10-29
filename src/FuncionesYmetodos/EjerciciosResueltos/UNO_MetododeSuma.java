package FuncionesYmetodos.EjerciciosResueltos;
import java.util.Scanner;

public class UNO_MetododeSuma {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int y;
        int x;
        System.out.println("ingresa el dato para sumar ");
        y= Integer.parseInt(entrada.nextLine());
        System.out.println("ingresa otro dato para sumar ");
        x=Integer.parseInt(entrada.nextLine());


        int z=suma(y,x);
        System.out.println("la suma de los dos otros datos es: "+z);
    }

    public static int suma(int y, int x){
        return y+x;
    }
}

