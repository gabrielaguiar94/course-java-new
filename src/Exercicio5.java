import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int peca1, qnt1, peca2, qnt2;
		double valor1, valor2, totalpagar;

		peca1 = sc.nextInt();
		qnt1 = sc.nextInt();
		valor1 = sc.nextDouble();

		peca2 = sc.nextInt();
		qnt2 = sc.nextInt();
		valor2 = sc.nextDouble();

		totalpagar = valor1 * qnt1 + valor2 * qnt2;

		System.out.printf("VALOR A PAGAR = R$ %.2f%n", totalpagar);

		sc.close();
	}
}