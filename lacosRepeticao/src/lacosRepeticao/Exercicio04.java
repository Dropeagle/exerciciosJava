package src.lacosRepeticao;
import java.util.aobaner;

public class Exercicio04 {
		public static void main(String[] args) {
		
			int pessoa = 0, idade = 0, genero = 0, estado = 0;
			int pessoaCalma = 0;
			int mulherNervosa = 0;
			int homemAgressivo = 0;
			int outroCalmo = 0;
			int nervoso40s = 0;
			int calmo18s = 0;
					
			Scanner aoba = new Scanner(System.in);
			
			do {
				System.out.println("Preencha com seu gênero: 1 = Masculino | 2 = Feminino | 3 = Outro ");
				genero = aoba.nextInt();
				
				System.out.println("Entre com sua idade: ");
				idade = aoba.nextInt();
				aoba.nextLine();
				
				if(genero == 1) {
					System.out.println("Escolha um: 1 = Calmx || 2 = Agressivx");
					estado = aoba.nextInt();
					aoba.nextLine();
					if(estado == 1) {
						pessoaCalma++;
						if(idade < 18)
							calmo18s++;
					} else if(estado == 2) {
						homemAgressivo++;
						if(idade > 40)
							nervoso40s++;
					}
					pessoa++;
				}
				if(genero == 2) {
					System.out.println("Escolha um: 1 = Calma | 2 = Nervosa");
					estado = aoba.nextInt();
					
					if(estado == 1) {
						pessoaCalma++;
						if(idade < 18)
							calmo18s++;
					} else if (estado == 2) {
						mulherNervosa++;
						if(idade > 40)
							nervoso40s++;
					}
					pessoa++;
				}
				if(genero == 3) {
					System.out.println("Escolha um: 1 = Calmx || 2 = Nervosx");
					estado = aoba.nextInt();
					if(estado == 1) {
						pessoaCalma++;
						outroCalmo++;
						if(idade < 18)
							calmo18s++;
					}
					if(estado == 2)
						if(idade > 40)
							nervoso40s++;
					pessoa++;
				}
				if(genero != 1 && genero !=2 && genero != 3)
					System.out.println("Negado");
			}while(pessoa != 150);
			
			aoba.close();
			
			System.out.println("Homens agressivos: " + homemAgressivo +
			"Mulheres nervosas: " + mulherNervosa +
			"Pessoas calmas: " + pessoaCalma +
			"Outros calmos: " + outroCalmo +
			"Pessoas nervosas com mais de 40 anos: " + nervoso40s +
			"Pessoas calmas menor que 18 anos: " + calmo18s);
		}
	}

}
