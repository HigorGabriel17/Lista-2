import java.util.Scanner;
 
public class Ex2 {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        System.out.println("Por favor, digite um número de 0 a 100: ");
        double num = entrada.nextDouble();
 
        if (num >= 0 && num <= 100) {
            if (num % 2 == 0) {
                System.out.println("Número par!");
            }else{
                System.out.println("Número ímpar!");
            }
 
        }else{
    
       System.out.println("Número está fora da faixa!");
        }
    }
}
