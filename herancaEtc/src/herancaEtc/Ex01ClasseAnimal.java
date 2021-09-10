package herancaEtc;

public abstract class Ex01ClasseAnimal implements Ex01InterfaceAnimal {
	private String name = "";
	private int age = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
