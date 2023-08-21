package entities;

public class student {
	
	public String name;
	public double x;
	public String condition;
	
	public void calculeGrades(double x) {
		
		if(x >= 60 ) {
			condition = "PASS";
		} else {
			condition = "FAILED";
		}
	}
}	

