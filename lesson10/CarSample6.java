package lesson10;

class CarSample6 {

	private int num;
	private double gas;

	public CarSample6() {

		num = 0;
		gas = 0.0;

		System.out.println("車を作成しました。");
	}

	public void setCar(int n, double g) {

		num = n;
		gas = g;

		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にします。");
	}

	public void show() {

		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");

	}
}
