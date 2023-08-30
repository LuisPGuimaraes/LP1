import java.util.Scanner;
public class Ex_12 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			double temp_f = sc.nextDouble();
			double temp_c = ((temp_f - 32)/9 * 5);
			System.out.println("Temperatura em Celsius: " + temp_c);
			
			
		}
	}

}
