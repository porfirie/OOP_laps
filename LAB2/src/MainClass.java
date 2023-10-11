import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int inputValue = input.nextInt();
		System.out.println("Valoare citita este " + inputValue);
		int maxInt = Integer.MAX_VALUE;
		System.out.println(maxInt + 1);
		int minInt = Integer.MIN_VALUE;
		System.out.println(minInt - 1);
		float maxFloat = Float.MAX_VALUE;
		System.out.println(maxFloat * 3);
		try {
			System.out.println(maxInt / inputValue);
		} catch (ArithmeticException exception) {
			System.out.println("hei , ai introdus o vlaoare gresita!");
			inputValue = input.nextInt();
		}
		System.out.println("noua valoare " + inputValue);

	}

}
