package examen;

/**
 *
 * @author clamascabaleiro
 */
public class Factorial {

    public static void main(String[] args) {

        int numero; // Cambio j por numero
        int factorial; // Cambio f por factorial

        numero = 8; // j por numero

        int producto; // i lo cambio por producto
        if (numero == 0) { // Cambio j por numero
            factorial = 1; // Cambio f por factorial
        } else {
            factorial = 1; // Cambio f por factorial
            for (producto = numero; producto >= 1; producto--) { // Cambio i por producto, j por numero
                factorial = factorial * producto; // Cambio f por factorial , i por producto
            }
        }

        System.out.println(factorial); //Cambio f por factorial

    }

}
