package orientacaoObj;

public class Ex02Main {
	public static void main(String[]agrs) {
		Ex02ClasseAviao newAviao = new Ex02ClasseAviao();
		newAviao.setPassengers(34);
		newAviao.setWeight(560.000);
		newAviao.setAgency("Dekolar");
		
		System.out.println("A agência " + newAviao.getAgency() + " possuem aviões que são capazes de conter: "
		+ newAviao.getPassengers() + " passageiros, em média podendo alcançar seu peso em: " + newAviao.getWeight() + " Kg");
	}
}
