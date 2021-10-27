import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numA;
        Boolean resulA, resultB;

        // Para que el usuario introduzca un número correto:
        do{
            System.out.println("Introduzca un número entero positivo con una cantidad de cifras pares: ");
            numA = sc.nextLine();

        }while(numA.length() % 2 != 0 || Integer.parseInt(numA) <= 0);

        //Para saber cúales son las mitades:

    }
}
