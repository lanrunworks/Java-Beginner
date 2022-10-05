package lesson9;

class CalcutationBMI {
	private String name;
	private int age;
	public double height = 0.0;
	public double weight = 0.0;
	public double ansBMI = 0.0;
	public String resultBMI;
	public boolean ageCheck = true;

	//名前条件
	public void setInfo(String str) {
		name = str;
	}

	//年齢条件
	public void setInfo(int n) {
		int min = 1;
		int max = 100;
		if (n >= min && n <= max) {

			age = n;

		} else {

			ageCheck = false;

		}
	}

	//BMI計算
	public void setInfo(double h, double w) {
		height = h;
		weight = w;
		ansBMI = weight / (height * height);
		//String result =null;
		//resultBMI = result;
		//BMI条件
		double range1 = 18.5;
		double range2 = 25.0;
		if (ansBMI < range1) {

			resultBMI = "瘦せ型";

		} else if (ansBMI >= range1 && ansBMI < range2) {

			resultBMI = "普通体型";

		} else if (ansBMI > range2) {

			resultBMI = "肥満体型";

		}

		System.out.println(name + "さん(" + age + "歳)のBMIは" + ansBMI + "です。");
		System.out.println("あなたの体型は「" + resultBMI + "」です。");
	}

}
