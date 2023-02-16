import java.util.Scanner;
public class PrimerEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite la cantidad de numeros que va a comparar: ");
        int cantidad = scanner.nextInt();

        if (cantidad < 10) {
            System.out.println("La cantidad de numeros debe ser como minimo 10");
        } else {
            int numMenor = Integer.MAX_VALUE;
            int numero;

            for (int i = 0; i < cantidad; i++) {
                System.out.print("numero " + (i + 1) + ": ");
                numero = scanner.nextInt();
                numMenor = (numero < numMenor) ? numero : numMenor;
            }

            System.out.println("El número menor es: " + numMenor);
            if (numMenor < 10) {
                System.out.println("El número " + numMenor + " es menor que 10");
            } else {
                System.out.println("El número " + numMenor + " es igual o mayor que 10");
            }
        }
    }
}
