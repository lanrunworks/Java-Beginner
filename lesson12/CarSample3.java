package lesson12;

class CarSample3 implements iVehicleSample3 {
	private int num;
	private double gas;

	public CarSample3(int n, double g) {
		num = n;
		gas = g;

		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にします。");
	}

	public void show() {

		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
