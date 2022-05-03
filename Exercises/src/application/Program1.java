package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangle;

public class Program1 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	Retangle x;
	x = new Retangle();
	
	System.out.print("Enter retangle width: ");
	x.width = sc.nextDouble();
	System.out.print("Enter retangle height: ");
	x.height = sc.nextDouble();
	double area = x.area();
	double perimeter = x.perimeter();
	double diagonal = x.diagonal();
	System.out.printf("AREA = %.2f\nPERIMETER = %.2f\nDIAGONAL = %.2f", area, perimeter, diagonal);
	sc.close();
	}
}
