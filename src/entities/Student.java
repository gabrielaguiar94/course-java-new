package entities;

public class Student {
	
	public String name;
	public double tri1;
	public double tri2;
	public double tri3;
	
	public double finalGrade() {
		return tri1 + tri2 + tri3;
	}
	
	public double faltaPoints() {
		
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}
		else {
			return 0.0;
		}
	}
	

}
