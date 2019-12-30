package operators;

public class StringEqualsExample {
	public static void main(String[] args) {
		String str1 = "신민철";
		String str2 = "신민철";
		String str3 = new String("신민철");
		
//		System.out.println(str1==str2);
//		System.out.println(str2==str3);
//		
//		System.out.println(str1.contentEquals(str2));
//		System.out.println(str1.contentEquals(str3));
//		
//		if (str1.equals(str3)) {  // 클래스를 비교 할 경우 equals)
//			System.out.println("같은 내용입니다.");
//		} else {
//			System.out.println("다른 내용입니다.");
//		}
		int var1 = 10;
		int var2 = 20;
		int var3 = 30;
		
		if (++var1 > 15 || ++var2 > 30) { // &를 2개쓸경우 앞조건이 참인지 거짓인지 먼저체크후 거짓이면 뒷부분 체크를안함
			System.out.println(var1 + "==== " + var2);
		}
		System.out.println(var1 + ", " + var2);
	}

	int score = 85;{
	char grade = (score>90) ? 'A' : 'B';
	if (score>90) {
		grade = 'A';
	} else grade = 'B';
	}
}