package lesson8;

class Sample6 {
	public static void main(String[]args) {
		CarSample6 car1 = new CarSample6();
		car1.setNumGas(1234,20.5);
		
		int number = car1.getNum();
		double gasoline= car1.getGas();
		
		System.out.println("サンプルから車を調べたところ");
		System.out.println("ナンバーは"+number+"ガソリン量は"+gasoline+"でした。");
	}
}
