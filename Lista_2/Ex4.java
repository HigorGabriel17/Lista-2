

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, digite algum número:");
        int num = teclado.nextInt();

        System.out.println("\nOs 20 múltiplos desse número:\n");

        for (int i = 1; i <= 20; i++) {
            System.out.println( num + " x " + i + " = " + num*i);
        }


    }

}