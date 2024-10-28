package EstructuraDeControl.EjerciciosResueltos;
import  java.util.Scanner;

public class DOS_DIasdelaSemana {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("ingresa que dia de la semana quieres ver(en numero)");
        String diaSemana=entrada.nextLine();
        switch (diaSemana){
            case "1":
                System.out.println("hoy es lunes w");
                break;
            case "2":
                System.out.println("hoy es martes w");
                break;
            case "3":
                System.out.println("hoy es miercoles w");
                break;
            case "4":
                System.out.println("hoy es jueves w");
                break;
            case "5":
                System.out.println("hoy es viernes w");
                break;
            case "6":
                System.out.println("hoy es sabado w");
                break;
            case "7":
                System.out.println("hoy es domingo w");
                break;
            default:
                System.out.println("que dia es ese w sub-norm...");
        }

    }
}
