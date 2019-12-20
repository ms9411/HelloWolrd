package referencetype;

import java.util.Scanner;

public class ArrayExample { // 학생5명 1.입력 2.합계 3.평균 4.종료 점수 100,90,70 summer
	public static void main(String[] args) {
		exam01();
		}
//	System.out.println("총합 : " + summary);
//	System.out.println("평균 : " + avg);
	public static void exam01() {
		
		boolean run = true;
		int balance = 0, menu = 0, amt = 0;
		int[] scores = {100, 90, 80, 0, 0};
		int summary = 0;
		double avg = 0;
		for(int i=0; i<3; i++) {
			summary += scores[i];
			avg = summary/3;
		}
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.입력 2.합계 3.평균 4.종료");
			System.out.println("---------------------");
			System.out.println("선택>");
			menu = scanner.nextInt();
			scanner.nextLine();
			if(menu==1) {
				System.out.println("입력>");
				amt = scanner.nextInt();
				balance = balance + amt;
			}else if(menu==2) {
				System.out.println("합계>");
				amt = scanner.nextInt();
				balance = balance - amt;
			}else if(menu==3) {
				System.out.println("평균>" + balance);
			}else if(menu==4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}

		
		
		
		
		
		
		
//		int[] num = new int[25];
//		int summary = 0;
//		double avg = 0; // avg는 평균
//		for (int i = 0; i < 25; i++) { // 25대신 num.lenght; 쓰기가능
//			num[i] = i + 1;
//			summary += num[i];
//			avg = summary/25.0;
//		}
//		for (int i = 0; i < 25; i++) {
//			summary += num[i];
//		}
//		System.out.println(summary);
//		avg = summary/25.0;
//		System.out.println(avg);
//		for (int i = 0; i < 25; i++) {
//			System.out.print(num[i] + " ");
//			if(i%5==4)
//			System.out.println();
//		}
//		int[] intAry = { 10 , 222 , 33 , 24 , 55 }; // int intAry[] 가능
//		System.out.println(intAry[2]);
//		intAry[2] = 30;
//		System.out.println(intAry[2]);
//		int sum = 0;
//		for (int i=0; i<5; i++) {
//			if(i % 2 == 0)
//			sum += intAry[i]; // sum = sum + 1;
//		}
//		System.out.println("합계는" + sum);
//		
//		String[] strAry = { "Hello" , "nice" , "good" , "wonderful" };
//		for (int i = 0; i < 4; i++)
//			System.out.println(strAry[i]);
//		}
//		
//	}