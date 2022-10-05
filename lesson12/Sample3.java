package lesson12;

class Sample3 {

	public static void main(String[] args) {

		iVehicleSample3[] ivc;
		ivc = new iVehicleSample3[2];

		ivc[0] = new CarSample3(1324, 20.5);
		ivc[1] = new PlaneSample3(232);

		for (int i = 0; i < ivc.length; i++) {
			ivc[i].show();
		}

	}

}
