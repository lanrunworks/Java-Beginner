package lesson8;

class CarSample4 {
	int num;
	double gas;

	void setNum(int n) {
		num = n;
		System.out.println("ナンバーを" + num + "にしました。");
	}

	void setGas(double g) {
		gas = g;
		System.out.println("ガソリン量を"+gas+"にしました。");
	}
	void show() {
		System.out.println("ナンバーを" + num + "にしました。");
		System.out.println("ガソリン量を"+gas+"にしました。");
	}
}
