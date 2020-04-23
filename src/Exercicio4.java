import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double s, h, salario;

		n = sc.nextInt();
		s = sc.nextDouble();
		h = sc.nextDouble();
		salario = s * h;

		System.out.println("NUMBER: " + n );
		System.out.printf("SALARY = U$ %.2f%n", salario);

		sc.close();

	}

}