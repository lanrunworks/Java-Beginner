package lesson9;

class CarSample4 {

	private int num;
	private double gas;

	public CarSample4() {

		num = 0;
		gas = 0.0;

		System.out.println("車を作成しました。");
	}

	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
