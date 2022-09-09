package oppgave;

import java.util.Scanner;

public class OppgaveO2 {
	public static void main(String[] args) {
		// TODO

		Scanner input = new Scanner(System.in);
		System.out.print("Poeng:");
		for (int i = 0; i < 10; i++) {

			int x = input.nextInt();

			if (x >= 0 && x <= 39) {

				System.out.println("F");
				System.out.print("Poeng:");
			} else if (x >= 40 && x <= 49) {
				System.out.println("E");

			} else if (x >= 50 && x <= 59) {
				System.out.println("D");
				System.out.print("Poeng:");
			} else if (x >= 60 && x <= 79) {
				System.out.println("C");
				System.out.print("Poeng:");
			} else if (x >= 80 && x <= 89) {
				System.out.println("B");
				System.out.print("Poeng:");
			} else if (x >= 90 && x <= 100) {
				System.out.println("A");
				System.out.print("Poeng:");
			} else {
				System.out.println("feil,prøv igjen");
			System.out.println("Poeng:");
			i--;
				
			}
		

		}
	}
}