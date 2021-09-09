package orientacaoObj;

public class Ex01Main {	
	public static void main(String[]agrs) {
		Ex01ClasseCliente newClient = new Ex01ClasseCliente();
		newClient.setName("Pedro");	
		newClient.setUser("Drope");
		newClient.setAge(19);
		newClient.setCollor("Red");
		
		System.out.println("Nome: " + newClient.getName() + " // Idade: " + newClient.getAge() + " // Usuário: " 
		+ newClient.getUser() + " // Cor: " + newClient.getCollor());
	}
}
