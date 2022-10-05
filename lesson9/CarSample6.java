package lesson9;

class CarSample6 {
	private int num;
	private double gas;

	public CarSample6() {
		num = 0;
		gas = 0.0;
		System.out.println("車の作成をしました。");
	}

	public CarSample6(int n, double g) {

		this();
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車の作成しました。");
	}

	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
