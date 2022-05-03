import java.util.Scanner;
public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		char resp;
		
		do {
			System.out.print("Digite o nome do usuário: ");
			String nome = sc.next();
			System.out.print("Digite a idade do usuário: ");
			int idade = sc.nextInt();
			System.out.println("Nome do usuário cadastrado: " + nome + " , idade: " + idade);
			System.out.println("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		System.out.println("Encerrando o programa...");
		sc.close();
	}
}
