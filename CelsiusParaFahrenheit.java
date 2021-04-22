import java.util.Scanner;

public class CelsiusParaFahrenheit {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        System.out.print("Informe a temperatura em Celsius: ");
        int celsius = teclado.nextInt();

        double fah = (celsius * 9/5) + 32;

        System.out.print(fah);
    }
    
}
