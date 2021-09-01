package lacosDecisao;

import java.util.Scanner;
public class Exercicio03 {
	public static void main (String[] args) {
		int idade = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		
		idade = scan.nextInt();
		scan.close();
		
			if(idade >= 10 && idade <= 14)
				System.out.println("Infantil");
			
			if(idade >= 15 && idade <= 17)
				System.out.println("Juvenil");
			
			if(idade >= 18 && idade <= 25)
				System.out.println("Adulto");
			
			if(idade < 10 || idade > 25) 
				System.out.println("Entrada invalida");
	}
}
