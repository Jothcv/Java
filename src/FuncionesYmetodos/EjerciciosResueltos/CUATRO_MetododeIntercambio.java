package FuncionesYmetodos.EjerciciosResueltos;


class Contenedor {
    int a;
    int b;

    public Contenedor(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
public class CUATRO_MetododeIntercambio {
    public static void intercambiar(Contenedor cont) {
        int temp = cont.a;
        cont.a = cont.b;
        cont.b = temp;
    }
    public static void main(String[] args) {
        Contenedor cont = new Contenedor(5, 10);

        System.out.println("Antes del intercambio: a = " + cont.a + ", b = " + cont.b);

        intercambiar(cont);

        System.out.println("Después del intercambio: a = " + cont.a + ", b = " + cont.b);
    }
}
