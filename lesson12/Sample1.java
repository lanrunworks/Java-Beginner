package lesson12;

class Sample1 {

	public static void main(String[] args) {

		VehicleSample1[] vc;
		vc = new VehicleSample1[2];

		vc[0] = new CarSample1(1234, 20.5);
		vc[0].setSpeed(60);

		vc[1] = new PlaneSample1(232);
		vc[1].setSpeed(500);

		for (int i = 0; i < vc.length; i++) {
			vc[i].show();
		}

	}

}
