import java.util.Scanner;

public class AreaQuadrado {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print ("Informe o valor da base: ");
        double base = teclado.nextDouble();
        System.out.print ("Informe o valor da altura: ");
        double altura = teclado.nextDouble();

        double dobroArea = (base*altura) * 2;

        System.out.print ("O dobro da área desse quadrado é "+dobroArea);
    }
    
}
