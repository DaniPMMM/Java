import java.util.Scanner;

public class RaioCirculo {

    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a medida do raio: ");
        double raio = teclado.nextDouble();

        double area = 3.14 * (raio*raio);

        System.out.print ("A área deste círculo é: "+area);
    }
    
}
