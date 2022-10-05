package lesson12;

class CarSample4 implements iVehicleSample4, iMaterialSample4 {
	private int num;
	private double gas;

	public CarSample4(int n, double g) {
		num = n;
		gas = g;

		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
	}

	public void vShow() {

		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}

	public void mShow() {
		System.out.println("車の素材は鉄です");
	}
}
