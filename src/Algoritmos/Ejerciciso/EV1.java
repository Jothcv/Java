package Algoritmos.Ejerciciso;

import java.util.Scanner;

public class EV1 {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);

        System.out.println("ingrese cuantos estudainte quiere agregar");
        int est=Integer.parseInt(entrada.nextLine());

        for (int i=1;i<=est;i++){
            System.out.println("Bienvenido a la Escuela el papu");
            System.out.println("--------------------------------");
            System.out.println("ingrese su nombre de estudiante: ");
            String nombre=entrada.nextLine();
            System.out.println("--------------------------------");
            System.out.println("ingrese su edad: ");
            System.out.println("--------------------------------");
            int edad=Integer.parseInt(entrada.nextLine());
            System.out.println("--------------------------------");

            if (edad>=4 && edad<=6){
                System.out.println("El estudainte "+nombre+" tiene que el horario de lunes y miercoles de 16 a 17");
            }
            else if (edad>=7 && edad<=8){
                System.out.println("El estudiante: "+nombre+ " tiene el horario de martes y miercoles de 17:30 a 19");
            }
            else if (edad>=9 && edad<=10){
                System.out.println("el estudiante"+nombre+ " tiene el horario de martes y jueves de 17:30 a 19");
            } else if (edad>=11 && edad<=13) {
                System.out.println("el estudiante"+nombre+ " tiene el horario de luner y miercoles de 17 a 18");
            }
            else{
                System.out.println("la edad de "+ nombre+ " no tiene registro de horario");
            }
            System.out.println("--------------------------------");
        }
        entrada.close();
    }
}
