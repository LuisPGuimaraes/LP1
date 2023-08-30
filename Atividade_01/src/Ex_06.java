import java.util.Scanner;
public class Ex_06 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Digite a altura:");
			double altura = sc.nextDouble();
			System.out.print("Digite a base:");
			double base = sc.nextDouble();
			
			double area = base * altura;
			
			System.out.println("Área calculada: " + area);
		}
		
				
	}

}
