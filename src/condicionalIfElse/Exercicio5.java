package condicionalIfElse;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo,quantidade;
		codigo = sc.nextInt();
		quantidade= sc.nextInt();
		double resultado=0;
		if (codigo==1) {
			resultado=quantidade*4.0;
		} else if(codigo==2) {
			resultado=quantidade*4.5;
		} else if(codigo==3) {
			resultado=quantidade*5.0;
		} else if(codigo==4) {
			resultado=quantidade*2.0;
		} else {
			resultado=quantidade*1.5;
		}
		System.out.printf("TOTAL= R$ %.2f%n",resultado);
		sc.close();
	}
}
