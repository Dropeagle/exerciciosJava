package herancaEtc;

public class Ex01Main {
	public static void main(String[]args) {
		Ex01ClasseCachorro dog = new Ex01ClasseCachorro();
		Ex01ClasseCavalo horse = new Ex01ClasseCavalo();
		Ex01ClassePreguica sloth = new Ex01ClassePreguica();
		
		dog.issueSound();
		horse.issueSound();
		sloth.issueSound();
	}
}
