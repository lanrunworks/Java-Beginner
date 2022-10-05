package lesson10;

class CarSample9 {
	int num;
	double gas;

	public CarSample9() {

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
