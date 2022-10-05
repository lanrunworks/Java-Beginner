package lesson14;

class Car {
	private int num;
	private double gas;

	public void setCar(int n, double g) throws CarException {
		if (g < 0) {
			CarException e = new CarException();
			throw e;
		} else {
			num = n;
			gas = g;

			System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
		}
	}

	public void show() {

		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");

	}
}
