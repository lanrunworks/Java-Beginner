package lesson15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sample12 {

	public static void main(String[] args) throws Exception {

		SimpleDateFormat f = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");

		Date d = f.parse("2020/09/22 01:23:45");
		System.out.println(d);

		Date now = new Date();
		String s = f.format(now);
		System.out.println("現在は" + s + "です");

	}

}
