package application;

import classes.Avaliado;

import java.util.Locale;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
		
	System.out.println("Deseja iniciar uma nova avaliação? (s/n):");
		
		
	System.out.print("Nome: ");
	String nome = sc.nextLine();
	
	System.out.print("Idade: ");
	int idade = sc.nextInt();
	
	System.out.print("Peso: ");
	double peso = sc.nextDouble();
	
	System.out.print("Altura: ");
	double altura = sc.nextDouble();
	
	System.out.print("Sexo: ");
	String sexo = sc.next();
	
	Avaliado avaliado = new Avaliado(nome, idade, peso, altura, sexo);
	
	avaliado.indiceMassaCorporal();
	System.out.printf("imc: %.2f", avaliado.indiceMassaCorporal());
	
	
	sc.close();
	}
}
