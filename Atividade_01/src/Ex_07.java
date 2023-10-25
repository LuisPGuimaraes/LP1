import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in) ;
			System.out.print("Digite quantos anos tem: ");
			double ano = sc.nextDouble() * 365;
			System.out.print("Digite quantos meses tem: ");
			double mes = sc.nextDouble() * 30;
			System.out.print("Digite quantos dias tem: ");
			double dia = sc.nextDouble();
			
			double total = ano + mes + dia;
			System.out.println("Total de dias na Terra: " + total);
		}
	
	}

