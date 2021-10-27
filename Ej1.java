import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, posicion;

        // Para que el usuario introduzca un número correto:
        System.out.println("Introduzca la altura: ");
        altura = sc.nextInt();

        while (altura <= 3 || (altura % 2 == 0)) {
            System.out.println("Introduzca una altura válida.");
            altura = sc.nextInt();
        }

        // Para generar las Z:
        posicion = altura;

        for (int i = altura; i > 0; i--) {
            System.out.println();
            // Para generar el principio y el final de las Z:
            if (i == altura || i == 1) {
                for (int j = altura; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.print("   ");
                for (int p = altura; p > 0; p--) {
                    System.out.print("*");
                }
                // Para general las diagonales de las Z:
            } else {
                for (int m = 1; m < posicion; m++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int p = posicion; p < altura; p++) {
                    System.out.print(" ");
                }
                System.out.print("   ");
                for (int g = 1; g < posicion; g++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            posicion--;
        }
    }
}

