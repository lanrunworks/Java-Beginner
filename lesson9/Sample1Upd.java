package lesson9;

class Sample1Upd {
	public static void main(String[] args) {
		CarSample1 car1;
		car1 = new CarSample1();

		car1.num = 1234;
		car1.gas = -10.0;

		System.out.println("車のナンバーは" + car1.num + "です。");
		System.out.println("ガソリン量は" + car1.gas + "です。");
	}
}
