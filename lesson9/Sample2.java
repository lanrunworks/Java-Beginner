package lesson9;

class Sample2 {
	public static void main(String[] args) {
		CarSample2 car1 = new CarSample2();
		
		//このようなアクセスはできなくなります。
		//car1.num=1234;
		//car1.gas=-10.0
		car1.setNumGas(1234, 20.5);
		car1.show();

		System.out.println("正しくないガソリン量(-10.0)を指定してみます。");

		car1.setNumGas(1234, -10.0);
		car1.show();
	}
}
