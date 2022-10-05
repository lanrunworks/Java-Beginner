package lesson9;

class Cylinder {
	Circle data = new Circle();

	public void setCyl(double n, double h) {
		double hyoumen = 2 * data.pi * n * (h + n);
		double taiseki = n * n * data.pi * h;
		System.out.println("表面積は" + hyoumen + "です。");
		System.out.println("体積は" + taiseki + "です。");
	}
}
