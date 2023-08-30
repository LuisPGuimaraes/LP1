import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Digites quantos anos tem: ");
			double ano = sc.nextDouble() * 365;
			System.out.print("Digites quantos meses tem: ");
			double mes = sc.nextDouble() * 30;
			System.out.print("Digites quantos dias tem: ");
			double dia = sc.nextDouble();
			
			double total = ano + mes + dia;
			System.out.println("Total de dias na Terra: " + total);
		}
	
	}

	
}
