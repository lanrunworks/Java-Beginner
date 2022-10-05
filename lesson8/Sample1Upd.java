package lesson8;

class Sample1Upd {
	public static void main(String[] args) {
		
		CarSample1 car1;
		car1 = new CarSample1();
		car1.num = 1234;
		car1.gas = 20.5;

		CarSample1 car2;
		car2 = new CarSample1();
		car2.num = 2345;
		car2.gas = 30.5;
		
		System.out.println("車のナンバーは" + car1.num + "です。");
		System.out.println("ガソリン量は" + car1.gas + "です。\n");
		
		System.out.println("車のナンバーは" + car2.num + "です。");
		System.out.println("ガソリン量は" + car2.gas + "です。");
	}
}
