import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, pi = 3.14159;
		
		a = sc.nextDouble();
		
		b = pi * a * a;
		
		System.out.printf("A = %.4f%n", b);

		sc.close();
	}
}