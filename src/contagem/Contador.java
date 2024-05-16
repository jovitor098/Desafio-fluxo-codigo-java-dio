package contagem;

import java.util.Scanner;
import java.util.Locale;

public class Contador {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		int parametroUm = scanner.nextInt();
		int parametroDois = scanner.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O primeiro parametro tem que ser menor que o segundo " + e);
		}
		finally {
			scanner.close();
		}
		
	}
	public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
		if (parametro1 > parametro2)
			throw new ParametrosInvalidosException();
		
		int contagem = parametro2 - parametro1;
		
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo " + i);
		}
	}

}
