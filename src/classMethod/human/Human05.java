package classMethod.human;

public class Human05 {
	private String name;
	private int age;
	//private は直接参照できない(yamada.nameやyamada.ageでは参照できない)

	public Human05() {
		name = "山田";
		age = 20;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
