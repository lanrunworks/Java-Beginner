package lesson9;

class CarSample7 {
	private int num;
	private double gas;

	public CarSample7() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}

	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車の作成しました。");
	}

	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
