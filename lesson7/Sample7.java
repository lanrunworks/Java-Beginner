package lesson7;

public class Sample7 {
	public static void main(String[]args) {
		int[]test= {80,60,22,50,75};
		
		for (int i = 0; i<5 ; i++) {
			System.out.println((i+1)+"番目の人の点数は"+test[i]);
		}
		System.out.println(test.length);
	}
}
