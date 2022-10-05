package lesson16;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample1Upd2 {

	public static void main(String[] args) {

		ArrayList<Integer> points = new ArrayList<Integer>();

		points.add(10);
		points.add(80);
		points.add(75);

		Iterator<Integer> it = points.iterator();

		while (it.hasNext()) {
			int i = it.next();
			System.out.println(i);
		}

	}

}
