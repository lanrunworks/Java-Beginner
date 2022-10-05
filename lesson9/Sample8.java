package lesson9;

public class Sample8 {
	public static void main(String[] args) {
		CarSample8.showSum();

		CarSample8 car1 = new CarSample8();
		car1.setCar(1234, 20.5);

		CarSample8.showSum();

		CarSample8 car2 = new CarSample8();
		car2.setCar(4567, 30.5);

		CarSample8.showSum();
	}
}
