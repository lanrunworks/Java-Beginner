package lesson9;

class Lesson9C {
	public static void main(String[] args) {
		Creature mon = new Creature();
		mon.monster();
		System.out.println("生物の名前は" + mon.name + "です");
		System.out.println("生物の生命値は" + mon.HP + "です");

		Creature mon2 = new Creature();
		mon2.setName("ドラキー");
		mon2.setHp(50);
		System.out.println("生物の名前は" + mon2.name + "です");
		System.out.println("生物の生命値は" + mon2.HP + "です");
	}
}
