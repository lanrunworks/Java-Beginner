package lesson12;

class Pillar {

	private double high;
	private double shape;

	public Pillar(double a, double b) {
		high = a;
		shape = b;
	}

	public double calcVolume() {
		return high * shape;
	}

}
