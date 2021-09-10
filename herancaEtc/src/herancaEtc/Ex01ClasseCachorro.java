package herancaEtc;

public class Ex01ClasseCachorro extends Ex01ClasseAnimal {
	public void run() {
		System.out.println("\nO cachorro está correndo");
	}
	@Override
	public void issueSound() {
		System.out.println("\nBARK BARK");
	}
}
