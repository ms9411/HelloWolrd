package classes;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		int[] comAry = new int[3];
		for (int i=1; i<3; i++)
			comAry[i] = (int) (Math.random()*9)+1;
		for (int i = 0; i <3; i++)
//			System.out.println((int) (Math.random() * 9)+1);
			System.out.println(comAry[i]);
		
		Scanner scn = new Scanner(System.in);
		int[] userAry = new int[3];
		
		while (true) {
		for(int i=0; i<3; i++) {
			System.out.println("정수입력하세요.");
			userAry[i] = scn.nextInt();
		}
		int strike = 0, ball =0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(comAry[i] == userAry[i]) {
					if(i==j)
						strike++;
					else
						ball++;
				}
			}
		}
		System.out.println("strike: " + strike + ", ball: "+ball);
		if (strike ==3)
			break;
		}
		System.out.println("프로그램 종료.");
	}
}