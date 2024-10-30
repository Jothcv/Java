package EstructuraDeControl.EjerciciosResueltos;
import java.util.Scanner;
public class SEIS_p1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese el numero de la tabla que quiere ver: ");
        int IngesaTabla=Integer.parseInt(entrada.nextLine());

        for (int i=1;i<11;i++){
            System.out.println(i+"*"+IngesaTabla+"="+i*IngesaTabla);
        }
    }
}
