package lesson11;

class Sample9 {

	public static void main(String[] args) {

		CarSample9[] cars;
		cars = new CarSample9[2];

		cars[0] = new CarSample9();
		cars[1] = new RacingCar9();

		for (int i = 0; i < cars.length; i++) {
			Class cl = cars[i].getClass();
			System.out.println((i + 1) + "番目のオブジェクトのクラスは" + cl + "です。");
		}
	}

}
