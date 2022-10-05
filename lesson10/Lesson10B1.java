package lesson10;

class Lesson10B1 {
	public static void main(String[] args) {

		double sum1 = 100.0 / 3.0;
		double sum2 = 77.0 / 9.0;

		int i1 = (int) Math.round(sum1);
		int i2 = (int) Math.round(sum2);

		System.out.println("四捨五入前：100÷3＝" + sum1);
		System.out.println("四捨五入後：100÷3＝" + i1);
		System.out.println("四捨五入前：77÷9＝" + sum2);
		System.out.println("四捨五入後：77÷9＝" + i2);

	}
}
