import java.util.Scanner;


public class NumeroNaTela {
    public static void main (String[] args) {

         Scanner teclado = new Scanner(System.in);
        
         System.out.print("Digite um número inteiro: ");
         int numero = teclado.nextInt();
         System.out.println("O número informado foi: "+numero);

    }
    
}
