import java.util.Scanner;

public class MetrosParaCm {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe uma medida em metros: ");
        double medida = teclado.nextDouble();

        double result = medida*100;

        System.out.println(medida+"m é equivalente a "+result+"centímetros");



    }
    
}
