package lesson10;

public class Lesson10D2 {

	public static void main(String[] args) {

		//TestResultクラス型の配列を作成
		//Lesson10D1.javaの文を利用
		TestResult[] student = new TestResult[3];
		
		//String型の配列に名前を格納
		String[] names = new String[3];
		names[0] = "ポリテク太郎";
		names[1] = "ポリテク次郎";
		names[2] = "ポリテク三郎";

		//int型の配列に英語の点数を格納
		//以下にコーデイング
		int[] enSc = new int[3];
		enSc[0] = 70;
		enSc[1] = 90;
		enSc[2] = 60;

		//int型の配列に数学の点数を格納
		//以下にコーデイング
		int[] math = new int[3];
		math[0] = 70;
		math[1] = 90;
		math[2] = 60;

		//for文を使い、TestResultクラス型の配列に名前・英語の点数・数学の点数を格納
		//以下にコーデイング
		for (int i = 0; i < student.length; i++) {
			student[i] = new TestResult();
			student[i].setName(names[i]);
			student[i].setEnglishScore(enSc[i]);
			student[i].setMathScore(math[i]);
		}
		//配列の要素数の回数だけfor文をまわし、取得した値を使って標準出力
		//Lesson10D1.javaのfor文を利用
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName() + "さんの英語の点数は" + student[i].getEnglishScore() + "点、数学の点数は"
					+ student[i].getMathScore() + "点です。");
		}
	}

}
