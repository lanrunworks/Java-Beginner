package lesson8;

class Lesson8C {
	public static void main(String[] args) {

		Creature cat = new Creature();
		cat.setName("ネコ");
		cat.setHp(1);

		System.out.println("名前:" + cat.name);
		System.out.println("ライフ:" + cat.HP);

	}
}
