package lesson12;

class PlaneSample1 extends VehicleSample1 {

	private int flight;

	public PlaneSample1(int f) {

		flight = f;
		System.out.println("便" + flight + "の飛行機を作成しました。");

	}

	public void show() {

		System.out.println("飛行機の便は" + flight + "です。");
		System.out.println("速度は" + speed + "です。");

	}

}
