import java.util.Scanner;
public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		char resp;
		
		do {
			System.out.print("Digite o nome do usu�rio: ");
			String nome = sc.next();
			System.out.print("Digite a idade do usu�rio: ");
			int idade = sc.nextInt();
			System.out.println("Nome do usu�rio cadastrado: " + nome + " , idade: " + idade);
			System.out.println("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		System.out.println("Encerrando o programa...");
		sc.close();
	}
}
