import java.util.Scanner;
public class Ex_05 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Digite um número entre 0 e 9: ");
			int valor = sc.nextInt() - 1;
			System.out.println("Antecessor: " + valor);
		}
		
		
				
	}

}
