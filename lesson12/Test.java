package lesson12;

import java.util.Scanner;

class Test {

	public static void main(String[] args) {

		Scanner scanner = new java.util.Scanner(System.in);

		double num1 = scanner.nextInt();
		Circle cir = new Circle();
		cir.inHVar(num1);
		//		System.out.println(cir.calcArea());

		double num2 = scanner.nextInt();
		double num3 = scanner.nextInt();
		double num4 = scanner.nextInt();
		Trapezoid tra = new Trapezoid();
		tra.inTVar(num2, num3, num4);
		//		System.out.println(tra.calcArea());

		double num5 = scanner.nextInt();
		Pillar ci = new Pillar(num5, cir.calcArea());
		//		System.out.println(ci.calcVolume());
		Pillar tr = new Pillar(num5, tra.calcArea());
		//		System.out.println(tr.calcVolume());
		scanner.close();
		System.out.println(cir.calcArea());
		System.out.println(ci.calcVolume());
		System.out.println(tra.calcArea());
		System.out.println(tr.calcVolume());
	}

}
