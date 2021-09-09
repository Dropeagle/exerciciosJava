package src.vetoresMatriz;

import java.util.Random;

import java.util.Arrays;

public class Exercicio03 {	
	public static void main(String[] args) {	
	   int i, soma = 0, subida = 0, jogadas[] = new int[10];
	   double media = 0;
	   Random n = new Random();

	   for(i = 0; i < 10; ++i) {
		   jogadas[i] = n.nextInt(6) + 1;
		   soma += jogadas[i];

		  if(jogadas[i] > media) {
			  subida = jogadas[i];
			  soma = 0;
}
	         
	  }for(i = 0;  i< 10; ++i) {
	      if(jogadas[i] > media)	    	   	
	          ++soma;

	   }
	  System.out.println("Sorteados: " + Arrays.toString(jogadas));
	  System.out.println("%d Números são maiores que média aritmética dos 10 lançamentos\n%d porcento das jogadas foram 6\n" + soma + (subida * 100)/10);
	}
}