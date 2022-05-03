import java.util.Scanner;
public class Java {

public static void main(String [] args) {


Scanner sc = new Scanner(System.in);

System.out.println("Digite o nome do funcionário: ");
var nome = sc.nextLine();
System.out.println("Digite o tempo de empresa (em anos): ");
int tempo = sc.nextInt();
System.out.println("Digite o salário bruto: ");
double salario = sc.nextDouble();
double bonus = 0.0;

if (tempo < 3) {
	System.out.println("Não há bonificação salarial");
}
else if ((tempo >= 3) && (tempo <= 5)) {
	bonus = salario * 0.05;
	System.out.println("Bonificação salarial de " + bonus + "R$");
	}
else if ((tempo >= 6) && (tempo <= 10)) {
	bonus = salario * 0.10;
	System.out.println("Bonificação salarial de " + bonus + "R$");
	}
else {
	bonus = salario * 0.125;
	System.out.println("Bonificação salarial de " + bonus + "R$");
	System.out.println();
	}
double novo_salario = salario + bonus;
System.out.printf("O funcionário %s trabalha na empresa há %d anos.\nSeu salário bruto era de R$%.2f, e agora o salário é de R$%.2f",nome, tempo, salario, novo_salario);
}
}