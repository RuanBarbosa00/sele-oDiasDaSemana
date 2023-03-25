package ucsal;

import java.util.Scanner;

public class Selecao {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int diaDaSemana;
		
		System.out.println("Informe o dia da semana utilizando 1 a 7: ");
		diaDaSemana = input.nextInt();
		switch (diaDaSemana) {
		case 1:
			System.out.println("Segunda-Feira");
			break;
		case 2:
			System.out.println("Terça-Feira");
			break;
		case 3:
			System.out.println("Quarta-Feira");
			break;
		case 4:
			System.out.println("Quinta-Feira");
			break;
		case 5:
			System.out.println("Sexta-Feira");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;

		default:
			System.out.println("Valor fora do intervalo");
			break;
		}
		
		
	}

}
