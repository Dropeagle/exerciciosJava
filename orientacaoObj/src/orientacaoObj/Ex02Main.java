package orientacaoObj;

public class Ex02Main {
	public static void main(String[]agrs) {
		Ex02ClasseAviao newAviao = new Ex02ClasseAviao();
		newAviao.setPassengers(34);
		newAviao.setWeight(560.000);
		newAviao.setAgency("Dekolar");
		
		System.out.println("A ag�ncia " + newAviao.getAgency() + " possuem avi�es que s�o capazes de conter: "
		+ newAviao.getPassengers() + " passageiros, em m�dia podendo alcan�ar seu peso em: " + newAviao.getWeight() + " Kg");
	}
}
