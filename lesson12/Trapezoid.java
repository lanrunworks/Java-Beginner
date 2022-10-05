package lesson12;

class Trapezoid implements Shape {

	private double top;
	private double bottom;
	private double high;
	public double sumt;

	public void inTVar(double a, double b, double c) {
		top = a;
		bottom = b;
		high = c;
	}

	public double calcArea() {
		return (top + bottom) / 2 * high;
	}

}
