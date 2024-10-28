package EstructuraDeControl.EjerciciosResueltos;
import java.util.Scanner;

public class CUATRO_SumarNUmeros {
    public static void main(String[] args) {
        Scanner estrada=new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1 = Integer.parseInt(estrada.nextLine());

        while (num1!=0) {
            System.out.println("ingrese un numero");
            num1 = Integer.parseInt(estrada.nextLine());
        }
    }
}
