package lesson9;

class CarSample3 {

	private int num;
	private double gas;

	public void setCar(int n) {
		num = n;
		System.out.println("ナンバーを" + num + "にしました。");
	}

	void setCar(double g) {
		gas = g;
		System.out.println("ガソリン量を" + gas + "にしました。");
	}

	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}

	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
