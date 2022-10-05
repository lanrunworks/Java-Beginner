package lesson9;

class Creature {

	public String name;
	public int HP;

	public void setName(String n) {
		name = n;
	}

	public void setHp(int h) {
		HP = h;
	}

	public void monster() {
		name = "スライム";
		HP = 10;
	}

}
