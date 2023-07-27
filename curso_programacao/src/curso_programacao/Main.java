package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
			//Aqui, o sistema pede ao usuário para digitar a temperatura atual em C°.
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			
			double K = C + 273.15;
			double Re = C * 0.8;
			double Ra = (C * 1.8) + 32 + 459.67;
			double F = (C * 1.8) + 32;
			
			System.out.printf("Equivalente em Kelvin: %.1f%n", K);
			System.out.printf("Equivalente em Réaumur: %.1f%n", Re);
			System.out.printf("Equivalente em Rankine: %.1f%n", Ra);
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			
			System.out.print("Deseja repetir (s/n)? ");
			
			resp = sc.next().charAt(0);
			
		} while (resp != 'n');
			
     sc.close();
     
	}

}
