package entities;

public class Retangulo {

	public double altura;
	public double base;

	public double area() {
		return altura * base;

	}

	public double perimetro() {
		return (altura + base) * 2;

	}

	public double diagonal() {

		double d = Math.pow(altura, 2) + Math.pow(base, 2);		 
		return Math.sqrt(d);
		
	}

}
