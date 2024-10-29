package FuncionesYmetodos.EjerciciosResueltos;
import  java.util.Scanner;
public class DOS_MetododeFactorial {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int fact;
        System.out.println("ingrese un numero para ver su factorial: ");
        fact=Integer.parseInt(entrada.nextLine());
        int fact2=Factorial(fact);
        System.out.println(fact2);
    }

    public static int Factorial(int n){
        int factorial=1;
        for (int i=1;i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }
}
