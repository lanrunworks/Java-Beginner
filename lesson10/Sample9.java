package lesson10;

class Sample9 {
	public static void main(String[] args) {
		CarSample9[] cars;
		cars = new CarSample9[3];

		for (int i = 0; i < cars.length; i++) {
			cars[i] = new CarSample9();
		}

		cars[0].setCar(1234, 20.5);
		cars[1].setCar(2345, 30.5);
		cars[2].setCar(3456, 40.5);

		for (int i = 0; i < cars.length; i++) {
			cars[i].show();
		}
	}
}
