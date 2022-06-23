import java.util.Scanner;
 
public class Ex1 {
        public static void main(String[] args) {
 
            Scanner entrada = new Scanner(System.in);
 
            System.out.println("DIgite um número de 0 a 500: ");
            double num = entrada.nextDouble();
 
            if(num >= 100 && num <= 200){
                System.out.println("Você digitou um número que está entre 100 e 200!");
            }else{
                System.out.println("Você digitou um número que está fora da faixa!");
            }
        }
    }
