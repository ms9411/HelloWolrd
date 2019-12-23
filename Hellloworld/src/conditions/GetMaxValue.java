package conditions;

public class GetMaxValue {
	public static void main(String[] args) {
		int[] intary = { 8, 7, 6, 5, 4 };
		int temp = 0;
		for (int j = 0; j < (intary.length - 1); j++) {
			for (int i = 0; i < (intary.length - 1); i++) {
				if (intary[i] > intary[i + 1]) {
					temp = intary[i];
					intary[i] = intary[i + 1];
					intary[i + 1] = temp;
				}
			}
		}
		// intary = { 4, 5, 6, 7, 8}
		for (int i = 0; i < intary.length; i++) {
			System.out.println(intary[i] + " ");
		}
	}
}
