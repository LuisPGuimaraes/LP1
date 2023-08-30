import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
	try (Scanner sc = new Scanner (System.in)) {
		System.out.print("Digite um número:");
		double valor = sc.nextDouble();

		if (valor > 10){
			System.out.println("Maior que 10!");
		}
		else {
			System.out.println("Menor que 10!");
		
		}
	}
	}
}


