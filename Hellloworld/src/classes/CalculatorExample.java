package classes;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.excute();
		
		double avg = cal.avg(30, 50);
		cal.println("두수의 " + avg);
	}

}
