import java.util.Scanner;

public class TercerEjercicio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite su primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite su segundo numero: ");
        int numero2 = scanner.nextInt();
        int resultado = 0;

        boolean numeroPos1 = numero1 > -1;
        boolean numeroPos2 = numero2 > -1;

        int valorNumero1 = numeroPos1? numero1 : -numero1;

        for (int i = 0; i < valorNumero1; i++){
            resultado = resultado + numero2;
        }
        if (!(numeroPos1 && numeroPos2) || numeroPos1){
            resultado = resultado;
        }
        System.out.println("resultado = " + resultado);
    }
}
