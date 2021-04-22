import java.util.Scanner;

public class FahrenheitParaGraus {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a temperatura em Fahrenheit: ");
        int fah = teclado.nextInt();

        int celsius = (5 * (fah - 32)/9 );

        System.out.print ("A temperatura informada é "+celsius+"ºC");
    }
    
}
