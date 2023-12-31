package aprendizaje.bucles;

import java.util.Scanner;

public class Ejercicio12 {

    /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
    dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
    fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
    ser X y el último tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
    especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
    distinta de FDE, que no respete el formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
    e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
    siguientes funciones de Java Substring(), Length(), equals().*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String secuencia;
        int contCorrectas, contIncorrectas;
        String fde = "&&&&&";
        contCorrectas = 0;
        contIncorrectas = 0;


        do {
            System.out.println("Ingrese código para ser leído por el dispositivo RS232:");
            secuencia = leer.nextLine();

            if (secuencia.length() == 5 && secuencia.startsWith("X") && secuencia.endsWith("0")) {
                contCorrectas++;
            } else {
                contIncorrectas++;
            }
        } while (!secuencia.equals(fde));

        contIncorrectas--;

        System.out.println("La cantidad de lecturas incorrectas es de: " + contIncorrectas);
        System.out.println("La cantidad de lecturas correctas es de: " + contCorrectas);
    }
}
