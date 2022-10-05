package lesson16;

import java.util.ArrayList;

public class Sample1 {

	public static void main(String[] args) {

		ArrayList<Integer> points = new ArrayList<Integer>();

		points.add(10);
		points.add(80);
		points.add(75);

		for (int i = 0; i < points.size(); i++) {
			System.out.println(points.get(i));
		}

	}

}
