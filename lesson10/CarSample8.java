package lesson10;

class CarSample8 {
	private int num;
	private double gas;
	private String name;

	public CarSample8() {

		num = 0;
		gas = 0.0;
		name = "名無し";

		System.out.println("車を作成しました。");
	}

	public void setCar(int n, double g) {

		num = n;
		gas = g;

		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にします。");
	}

	public void setName(String nm) {
		name = nm;
		System.out.println("名前を" + name + "にしました。");
	}

	public void show() {

		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
		System.out.println("名前は" + name + "です。");

	}
}
