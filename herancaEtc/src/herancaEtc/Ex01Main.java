package herancaEtc;

public class Ex01Main {
	public static void main(String[]args) {
		Ex01ClassTestAnimal animal = new Ex01ClassTestAnimal();
		animal.testAnimal(new Ex01ClasseCachorro());
		animal.testAnimal(new Ex01ClasseCavalo());
		animal.testAnimal(new Ex01ClassePreguica());
		
		
	}
}
