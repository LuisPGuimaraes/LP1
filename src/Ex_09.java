import java.util.Scanner;
public class Ex_09 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Digite o salário atual: ");
			double sal_atual = sc.nextDouble();
			System.out.print("Digite o indice de reajuste em porcentagem: ");
			double indice = sc.nextDouble() / 100;
			
			double sal_novo = sal_atual * (1 + indice);
			System.out.println("Novo salário: R$" + sal_novo);
			
		}
		
	}

}
