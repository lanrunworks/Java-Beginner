package lesson12;

class CarSample1 extends VehicleSample1 {

	private int num;
	private double gas;

	public CarSample1(int n, double g) {
		num = n;
		gas = g;

		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にします。");
	}

	public void show() {

		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
		System.out.println("速度は" + speed + "です。");

	}
}
