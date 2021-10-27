import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA, numB, largo = 0, total = 0;
        String posicion = "";

        // Para que el usuario introduzca un número correto:
        do {
            System.out.println("Introduzca un número válido: ");
            numA = sc.nextInt();
        } while (numA <= 0);

        System.out.println("Introduzca un número etre 0 y 9 ambos incluidos: ");
        numB = sc.nextInt();

        while (numB < 0 || numB > 9) {
            System.out.println("Introduzca un número válido: ");
            numB = sc.nextInt();
        }

        //Para saber el número y posición de ocurrencias:
        for (int i = numA; i > 0; i = i / 10) {
            largo++;
        }

        for (int j = largo; j > 0; j--) {
            if (numA % 10 == numB) {
                total++;
                if (j == largo) {
                    posicion = j + posicion;
                } else {
                    posicion = j + " - " + posicion;
                }

            }
            numA = numA / 10;
        }

        //Da el resultado por pantalla:
        System.out.println("Resultado: ");
        System.out.println(total + " ocurrencias.");
        System.out.println("Posiciones: ");
        System.out.println(posicion);

    }
}
