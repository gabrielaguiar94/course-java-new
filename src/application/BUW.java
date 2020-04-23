package application;

public class BUW {

	public static void main(String[] args) {
		
		//Boxing
		int x = 20;
		
		Object obj = 20;
		// ou Integer obj = 20; wrapper classes para tratar os tipos primitivos de forma transparente ao compilador
		
		System.out.println(obj);

		//Unboxing
		int y = (int) obj;
		
		System.out.println(y);
		
		
	}

}
