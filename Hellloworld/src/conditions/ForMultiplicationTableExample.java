package conditions;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
//		for (int m =2; m <= 9; m++) {
//			System.out.println("*** " + m + " 단 ***");
//			for (int n = 2; n <= 9; n++) {
//				System.out.print(n + " x " + m + " = " + (m*n) + " ");
//			}
//		}
			for (int i =1; i <= 9; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

	}
}
