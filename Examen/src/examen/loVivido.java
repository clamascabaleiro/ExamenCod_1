package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class loVivido {

    public static void main(String[] args) {
        String nombre; // Cambio la variable n por nombre
        String edad; // Cambio la variable e por edad

        int meses;  // Cambio la variable m por meses
        int dias; // Cambio la variable d por dias
        int horas; // Cambio la variable h por horas
        int años; // Cambio la variable a por años

        nombre = JOptionPane.showInputDialog("Escriba su nombre: "); // Cambia n por nombre
        edad = JOptionPane.showInputDialog("Escriba su edad: "); // Cambia e por edad

        años = Integer.parseInt(edad); // Cambia a por años

        meses = (años * 12); // Cambia m por meses
        dias = (años * 365); // Cambia d por dias
        horas = (dias * 24); // Cambia h por horas

        JOptionPane.showMessageDialog(null, "Meses: " + meses, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE); // Cambia m y n por meses y nombre

        JOptionPane.showMessageDialog(null, "Días: " + dias, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE); // Cambia d y n por dias y nombre

        JOptionPane.showMessageDialog(null, "Horas: " + horas, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE); // Cambia h y n por horas y nombre

        System.exit(0);

    }

}

