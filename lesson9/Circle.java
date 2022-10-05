package lesson9;

class Circle {
	public double pi = 3.14;

	public void setCir(double n) {
		double enshu = 2 * pi * n;
		double menseki = n * n * pi;
		System.out.println("円周は" + enshu + "です。");
		System.out.println("円の面積は" + menseki + "です。");
	}
}
