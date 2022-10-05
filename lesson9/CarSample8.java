package lesson9;

class CarSample8 {

	public static int sum = 0;
	private int num;
	private double gas;

	public CarSample8() {
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("車を作成しました。");
	}

	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車の作成しました。");
	}

	public static void showSum() {
		System.out.println("車は全部で" + sum + "台あります。");
	}

	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
