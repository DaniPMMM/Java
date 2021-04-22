import java.util.Scanner;

public class TotalSalario {
     public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora?: ");
        double salario = teclado.nextDouble();

        System.out.print("Quantas horas você trabalha por mês?: ");
        double horas = teclado.nextDouble();

        double totalsalario = salario*horas;

        System.out.print("Você ganha "+totalsalario+" reais por mês.");

        
    }
        
    }
    

