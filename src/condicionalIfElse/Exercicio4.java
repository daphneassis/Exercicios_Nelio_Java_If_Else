package condicionalIfElse;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hr_i, hr_f,duracao;
		hr_i=sc.nextInt();
		hr_f=sc.nextInt();
		duracao=Math.abs(hr_f-hr_i);
		if(duracao>0 && duracao<24) {
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		}else{
			System.out.println("O JOGO DUROU 24 HORAS");
		}
		
	}

}
