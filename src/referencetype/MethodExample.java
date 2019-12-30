package referencetype;

public class MethodExample {
	public static void main(String[] args) {
//		printStar();
//		int s1 = sum(3, 5);
//		double s1 = divideBy(5,3);
//		System.out.println("s1 은 "+ s1);
//		String result = printResult("김민석");
//		System.out.println(result);
		
		double s1 = calculator(3, 4, "+");
		System.out.println("s1 은 "+ s1);
	}
	
//	public static String printResult(String name) {
//		return "반갑습니다 " + name + " 씨.";
//	}
	
	public static double calculator(double a, double b, String cal) {
		double result = 1;
		return result;
	}
	
//	public static double divideBy(int a, int b) {
//		double result = (double) a / b;
//		return result;
//	}
	
	public static int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}
	
//	public static void printStar() {
//		System.out.println("*");
//	}
}
