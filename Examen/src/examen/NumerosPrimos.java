package examen;

/**
 *
 * @author clamascabaleiro
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean primo = false; // Cambio por p por primo

    public static void main(String arg[]) {
        int numDigitos = 0;
        int ndigitos = 0;
        numDigitos = Integer.parseInt(arg[0]);
        if (numDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int numero = 1; numero <= 99999; numero++) //Cambio i por numero
        {
            int divisionEntera = numero; //Cambio i por numero

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            ndigitos = contador;

            if (ndigitos == numDigitos) {
                if (numero < 4) {
                    primo = true; //Cambio p por primo
                } else {
                    if (numero % 2 == 0) {
                        primo = false; //Cambio p por primo
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (numero - 1) / 2; // Cambio i por numero
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (numero % i1 == 0) {
                                contador1++; // Cambio i por numero
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            primo = true; // Cambio p por primo
                        }
                    }
                }

                if (primo == true) //Cambio p por primo
                {
                    System.out.println(numero);
                }
            }
        }
    }

}
