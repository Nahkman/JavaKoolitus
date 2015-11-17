package praktikum1;

public class Tsyklid {

	public static void main(String[] args) {
		
		int size = 10;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int value = Math.min(size - 1 - j, size - 1- i);
				//String.format("%2d", j);
				System.out.printf("%2d", value);
			}
			System.out.println();
		}

	}

}
