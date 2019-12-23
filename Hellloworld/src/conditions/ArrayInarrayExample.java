package conditions;

public class ArrayInarrayExample {
	public static void main(String[] args) {
		int[][] intary = new int [5][4];
		int num = 1;
			for(int j = 0; j < 5; j++) {
				for(int i = 0; i < 4; i++) {
					intary[j][i] = num++; // int [][] 배열의 위치
			}
	}
	for (int j = 0; j < 5; j++) {
		for (int i = 0; i < 4; i++) {
			System.out.print(intary[j][i] + " ");
		}
		System.out.println();
	}
//		intary[0][0] = 1;
//		intary[0][1] = 2;
//		intary[0][2] = 3;
//		intary[0][3] = 4; // 수동

	}

}
