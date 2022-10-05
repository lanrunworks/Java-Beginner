package lesson11;

class Sample8 {

	public static void main(String[] args) {

		CarSample8 car1 = new CarSample8();
		CarSample8 car2 = new CarSample8();

		CarSample8 car3;
		car3 = car1;

		boolean bl1 = car1.equals(car2);
		boolean bl2 = car1.equals(car3);

		System.out.println("car1とcar2が同じか調べたところ" + bl1 + "でした。");
		System.out.println("car2とcar3が同じか調べたところ" + bl2 + "でした。");

	}

}
