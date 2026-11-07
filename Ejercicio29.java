import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.print("Introduce un número: ");
        num = teclado.nextInt();

        while (num % 2 != 0 || num % 3 != 0) {
            System.out.println("Error: el número debe ser divisible por 2 y 3.");
            System.out.print("Introduce un número: ");
            num = teclado.nextInt();
        }

        System.out.println("División entre 2: " + (num / 2));
        System.out.println("División entre 3: " + (num / 3));
    }
}
