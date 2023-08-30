import java.util.Scanner;
public class Ex_10 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Digite o valor do veiculo de fábrica: ");
			double valor_fabrica = sc.nextDouble();
			double valor_final = valor_fabrica * 1.73;
			System.out.println("Valor final para o consumidor: R$" + valor_final);
		}
		

	}

}
