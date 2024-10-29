package FuncionesYmetodos.EjerciciosResueltos;

public class ContadorVocales {

    public static int contarVocales(String cadena) {
        int contador = 0;
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String texto = "Hola, ¿cómo estás?";
        System.out.println("La cadena tiene " + contarVocales(texto) + " vocales.");
    }
}
