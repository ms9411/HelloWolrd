package classes;

public class MethodExample1 {
	public static void main(String[] args) {
		showname() ;
		showname("LCh") ;
		showage(30) ;
	}
	public static void showname() {
		System.out.println("Hello, I am Charlie");
	}
	public static void showname(String name) {
		System.out.println("Hello, I am Charlie" + name);
	}
	public static void showage(int age) {
		System.out.println("Hello, I am Charlie" + age + "year old.");
	}
}
