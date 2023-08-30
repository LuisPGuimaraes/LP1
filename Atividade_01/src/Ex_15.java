import java.util.Scanner;
public class Ex_15 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("DIGITE UM VALOR NEGATIVO OU POSITIVO: ");
			double valor = sc.nextDouble();
			
			if ( valor >= 0) {
				System.out.println("Positivo");
				}
			else {
				System.out.println("Negativo");
				}
		}

	}

}
