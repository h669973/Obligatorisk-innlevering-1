package oppgave;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class OppgaveO1 {

	public static void main(String[] args) {
		// TODO

		Scanner input = new Scanner(System.in);

		System.out.print("inntekt:");
		int x = parseInt(input.nextLine());

		if (x > 164100 && x < 230951) {
			System.out.println(x - x * 0.0093);
		} else if (x > 230950 && x < 580651) {
			System.out.println(x - x * 0.0241);
		} else if (x > 580650 && x < 934051) {
			System.out.println(x - x * 0.1152);
		} else if (x > 934050) {
			System.out.println(x - x * 0.1452);
		} else {
			System.out.println(0);

		}

	}
}
