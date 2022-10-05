package lesson7;

public class Lesson7B3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//100個、配列作る
		int[] array = new int[100];
		//改行カウンター
		int count = 0;

		//100個配列に値が入るまで繰り返す
		for (int i = 0; i < array.length; i++) {

			//999個までの値をランダムに代入する
			array[i] = (int) (Math.random() * 999 + 1);
			//順々に出力する
			System.out.print(array[i] + "\t");

			count++;//10で割り切れたらに改行する
			if (count % 10 == 0) {
				System.out.println();
			}
		}

	}

}
