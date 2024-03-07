import java.util.Random;

public class MediaNumerosAleatorios {
    public static void main(String[] args) {
        int cantidadNumeros = 10; // Puedes cambiar esta variable para ajustar la cantidad de números aleatorios
        double suma = 0;

        // Generar números aleatorios
        Random rand = new Random();
        System.out.println("Números aleatorios generados:");
        for (int i = 0; i < cantidadNumeros; i++) {
            double numeroAleatorio = rand.nextDouble() * 100; // Genera números entre 0 y 100
            System.out.println(numeroAleatorio);
            suma += numeroAleatorio;
        }

        // Calcular media
        double media = suma / cantidadNumeros;
        System.out.println("La media de los números generados es: " + media);
    }
}
