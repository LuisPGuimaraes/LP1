import java.util.Scanner;

public class ex_79 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Double vet[] = new Double[20];
        Double nota_aluno;


        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a nota do Aluno " + i);
            nota_aluno = sc.nextDouble();
            vet[i] = nota_aluno;
            

        }
    }
}
