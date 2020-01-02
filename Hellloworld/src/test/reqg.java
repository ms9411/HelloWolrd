package test;

public class reqg {
	public static void main(String[] args) {
		int kor = 90;
		int eng = 70;
		int mat = 75;
		int sum = kor+eng+mat;
		float i = sum/3;
		
		System.out.println("이름 : 김철수");
		System.out.println("합계점수 : " + sum+ "점");
		System.out.println("평균점수 : " + String.format("%.1f",i));
		
}
}
