package lacosDecisao;

import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;
		double raiz, elevado;
		
		System.out.println("Digite um n�mero inteiro: ");
		num = ler.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Par.........");
			raiz = Math.sqrt(num);
			
			System.out.println("Raiz Quadrada " + raiz);
			System.out.println("Raiz Quadrada" + Math.sqrt(num));
			
		}
		else if(num % 2 == 1) {
			System.out.println("Impar..........");
			elevado = Math.pow(num, 2);
			
			System.out.println("Potencia: " + elevado);
		}

		ler.close();
	}

}
