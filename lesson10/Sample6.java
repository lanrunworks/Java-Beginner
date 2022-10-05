package lesson10;

class Sample6 {

	public static void main(String[] args) {

		CarSample6 car1;
		System.out.println("car1を宣言しました。");
		car1 = new CarSample6();
		car1.setCar(1234, 20.5);

		CarSample6 car2;
		System.out.println("car2を宣言しました。");

		car2 = car1;
		System.out.println("car2にcar1を代入しました。");

		System.out.print("car1がさす");
		car1.show();
		System.out.print("car2がさす");
		car2.show();
	}
}
