package lesson12;

class Sample2 {
	public static void main(String[] args) {

		VehicleSample1[] vc;
		vc = new VehicleSample1[2];

		vc[0] = new CarSample1(1234, 20.5);
		vc[1] = new PlaneSample1(232);

		for (int i = 0; i < vc.length; i++) {
			if (vc[i] instanceof CarSample1)
				System.out.println((i + 1) + "番目のオブジェクトはCarクラスです。");
			else
				System.out.println((i + 1) + "番目のオブジェクトはCarクラスではありません。");

		}

	}
}
