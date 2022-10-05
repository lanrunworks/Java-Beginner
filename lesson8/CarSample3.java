package lesson8;

class CarSample3 {
	int num;
	double gas;
	
	void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
	
	void showCar() {
		System.out.println("これから車の情報を表示します。");
		show();
	}
}
