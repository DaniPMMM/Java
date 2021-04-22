import java.util.Scanner;

public class SomaDoisNumeros {

    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n1 = teclado.nextInt();
        System.out.println("Digite um outro número inteiro: ");
        int n2 = teclado.nextInt();
        int soma = n1 + n2;
        System.out.println("A soma dos dois números é: "+soma);
    
}
}
