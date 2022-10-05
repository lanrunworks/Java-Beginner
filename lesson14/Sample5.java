package lesson14;

class Sample5 {
	public static void main(String[] args) {
		Car car1 = new Car();
		try {
			car1.setCar(1324, -10.0);
		} catch (CarException e) {
			System.out.println(e + "が送出されました。");
		}
		car1.show();
	}
}
