import java.util.Scanner;
public class Ex_08 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Digite o total de eleitores");
			double eleitores = sc.nextInt();
			System.out.print("Digite o total de votos brancos");
			double brancos = sc.nextInt() / eleitores * 100;
			System.out.print("Digite o total de votos nulos");
			double nulos = sc.nextInt() / eleitores * 100;
			System.out.print("Digite o total de votos validos");
			double validos = sc.nextInt() / eleitores * 100;
			
			System.out.println("Brancos " + brancos + "%");
			System.out.println("Nulos " + nulos + "%");
			System.out.println("Válidos " + validos + "%");
		}
		
	}

}
