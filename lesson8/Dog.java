package lesson8;

public class Dog {
	private String name;
	private int age;

	public void setD(String n, int a) {
		name = n;
		age = a;
	}

	public void show() {
		System.out.println("犬の名前は" + name + "です。");
		System.out.println("犬の名前は" + age + "です。");
	}
}
