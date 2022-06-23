import java.util.Scanner;
 
public class Ex5 {
 
    public static void main(String[] args) {
 
        Scanner agenda = new Scanner(System.in);
 
        int opcao = 0;
        do {
            System.out.println("----------Menu-----------");
            System.out.println("| 1 - Adicionar contato |");
            System.out.println("| 2 - Buscar contato    |");
            System.out.println("| 3 - Remover contato   |");
            System.out.println("| 4 - Editar contato    |");
            System.out.println("| 0 - Sair              |");
            System.out.println("-------------------------");
            System.out.println("Por favor, digite uma opção: ");
            opcao = agenda.nextInt();
 
            switch (opcao) {
                case 1:
                    System.out.println("Por favor, digite o número de telefone: ");
                    int contato = agenda.nextInt();
                    break;
                case 2:
                    System.out.println("Buscar o número de telefone: ");
                    int buscar = agenda.nextInt();
                    break;
                case 3:
                    System.out.println("Remover contato: ");
                    int remover = agenda.nextInt();
                    break;
                case 4:
                    System.out.println("Editar contato: ");
                    int editar = agenda.nextInt();
                    break;
            }
        }while (opcao != 0);
    }
}
