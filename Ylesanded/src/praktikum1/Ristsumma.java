package praktikum1;

import java.util.Scanner;

public class Ristsumma {

	public static void main(String[] args) {

		int sum = 0;

		// CTRL + shift +T - avab mistahes klassi workspace'is nagu näiteks
		// NumberFormatException
		// nüüd paremklõps klassil ja seejäel view hierarchy
		// Ctrl + L - go to line

		Scanner input = new Scanner(System.in);
		System.out.print("Insert an integer: ");
		// int number = input.nextInt();
		// String numberString = String.valueOf(number);
		String numberString = input.nextLine();
		for (int i = 0; i < numberString.length(); i++) {
			char c = numberString.charAt(i);
			try {
				sum += Integer.parseInt(String.valueOf(c));
			} catch (NumberFormatException e) { // Püüab konkreetse vea ja annab
												// infot, kui tava exception,
												// siis
												// ei tea mis viga täpselt oil
				System.out.format("Char '%s' is not a digit!\n", c);
			}

		}
		System.out.printf("Sum: %d", sum);

		input.close();

	}

}
