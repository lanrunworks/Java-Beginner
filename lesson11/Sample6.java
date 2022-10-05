package lesson11;

public class Sample6 {

	public static void main(String[] args) {

		CarSample4[] cars = new CarSample4[2];

		cars[0] = new CarSample4();
		cars[0].setCar(1234, 20.5);

		cars[1] = new RacingCar4();
		cars[1].setCar(4567, 30.5);

		for (int i = 0; i < cars.length; i++) {
			cars[i].show();
		}
	}

}
