package lacosRepeticao;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[]args) {
		
		Scanner aoba = new Scanner(System.in);
		int idade = 0, menor = 0, maior = 0;
		
			System.out.println("Para encerrar o programa a idade deverá valer -99");
		
		do {
			System.out.println("Digite sua idade: ");
			idade = aoba.nextInt();
			if(idade < 21 && idade > 0)
				menor++;
			if(idade > 50 && idade > 0)
				maior++;
				
			} while(idade != -99);
			  aoba.close();
			  System.out.println("Contém " + menor + " menores que 21 anos de idade e " + maior + " maiores que 50 anos de idade.");
		
		
	}

}
