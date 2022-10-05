package lesson9;

class Lesson9B {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("ポチ", 8);
		dog.show();
		Dog dog2 = new Dog();
		dog2.setName("鈴木", "タロウ", 2);
		dog2.show();
	}
}
