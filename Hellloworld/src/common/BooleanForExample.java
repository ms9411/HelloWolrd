package common;

public class BooleanForExample {
	public static void main(String[] args) {
		int var1 = 98;
		
		if (var1 > 90) { if (var1 > 95)
			System.out.println("A+");
			else
			System.out.println("A");
		} else if (var1 > 80) { if (var1 > 85)
			System.out.println("B+");
			else
			System.out.println("B");
		} else if (var1 > 70) { if (var1 > 75)
			System.out.println("C+");
			else
			System.out.println("C");
		} else if (var1 > 60) { if (var1 > 65)
			System.out.println("D+");
			else
			System.out.println("D");
		} else { if (var1 > 55)
			System.out.println("E+");
			else
			System.out.println("E");
		}
	}

}