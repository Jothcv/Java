package EstructuraDeControl.EjerciciosResueltos;
import java.util.Scanner;
public class CINCO_tablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("que tabla quiere ver: ");
        int tabla= Integer.parseInt(entrada.nextLine());
        for (int i=1;i<11;i++){
            System.out.println(i+"*"+tabla+"="+i*tabla);
        }
    }
}
