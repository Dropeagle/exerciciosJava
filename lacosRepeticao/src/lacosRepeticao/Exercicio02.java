package lacosRepeticao; 

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] argss) {
                
        int num[] = new int[10];
        int contPar = 0, contImpar = 0;
        
        Scanner eba = new Scanner(System.in);
        
        	for(int i = 0; i <= 10; i++) {
		            System.out.println("Digite o " + i + "º número");
		            num[i] = eba.nextInt();
            
            }
        	for(int algum : num) {
        		if(algum % 2 == 0) {
        			System.out.println("Número: " + algum + " é par");
        			contPar++;
        		}
        		if(algum % 2 != 0) {
        			System.out.println("Número: " + algum + " é impar");
        			contImpar++;
        		}
          
        	}
        
        System.out.println("Foram digitados " + contPar + " números pares \n" + contImpar + " números impares");
        eba.close();
        
    }
}
