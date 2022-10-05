package lesson8;

class Sample5 {
	public static void main(String[] args) {
		CarSample5 car1 = new CarSample5();

		int number = 1234;
		double gasoline = 20.5;

		car1.setNumGas(number, gasoline);

		car1.show();
	}
}
