package FuncionesYmetodos.EjerciciosResueltos;
import javax.naming.NamingEnumeration;
import java.util.Scanner;
public class TRES_MetododeVerificaciondePrimo {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("ingrese el numero para ver si es primo o no: ");
        int numero1=Integer.parseInt(entrada.nextLine());

        System.out.println("este "+numero1+ " es primo? "+NumeroPrimo(numero1));

    }

    public static boolean NumeroPrimo(int n){
        if (n<=1){
            return false;
        }
        for (int i=2;i<Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
