package oppgave;

public class OppgaveO3 {

	public static void main(String[] args) {

		int n = 5;
		int svar = 1;
		for (int i = 1; i <= n; i++) {
			svar = svar * i * (n - 1) * n;
		}
		System.out.println(svar);
	}

}
