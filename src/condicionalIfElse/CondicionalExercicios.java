package condicionalIfElse;

import java.util.Scanner;

public class CondicionalExercicios {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int valor;
		valor= scan.nextInt();
		if (valor>=0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}

	}

}
