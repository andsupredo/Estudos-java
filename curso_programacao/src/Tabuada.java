public class Tabuada {

	public static void main(String[] args) {

	for (int i=0; i<11; i++) {
		System.out.println("\nTábuada do " + i + "\n");
		for(int j=0; j<11; j++) {
			int multiplicado = i * j;	
			System.out.println(i + " x " + j + " = " + multiplicado);
		}
	}	
	}
}