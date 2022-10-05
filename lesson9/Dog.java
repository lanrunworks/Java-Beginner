package lesson9;

public class Dog {
	private String name;
	private String fname;
	private int age;
	private String full;

	public void setName(String n, int a) {
		name = n;
		age = a;
	}

	public void setName(String fn, String ffn, int fa) {
		name = fn;
		fname = ffn;
		full = fn + " " + ffn;
		age = fa;
	}

	public void show() {
		if (fname == null) {
			System.out.println("犬の名前は" + name + "です。");
		} else {
			System.out.println("犬の名前は" + full + "です。");
		}
		System.out.println("犬の名前は" + age + "です。");
	}
}