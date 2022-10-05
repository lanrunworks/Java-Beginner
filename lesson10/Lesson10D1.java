package lesson10;

public class Lesson10D1 {

	public static void main(String[] args) {

		//TestResultクラス型の配列を作成
		//以下にコーデイング
		TestResult[] student = new TestResult[3];

		for (int i = 0; i < student.length; i++) {
			student[i] = new TestResult();
		}

		//オブジェクトに格納する値を変数に代入
		String name1 = "ポリテク太郎";
		int englishScore1 = 70;
		int mathScore1 = 85;

		//オブジェクトに格納する値を変数に代入
		String name2 = "ポリテク次郎";
		int englishScore2 = 90;
		int mathScore2 = 65;

		//オブジェクトに格納する値を変数に代入
		String name3 = "ポリテク三郎";
		int englishScore3 = 60;
		int mathScore3 = 95;

		//TestResultクラス型の配列の添字[0]の要素にオブジェクトを作成し、値を格納
		//以下にコーデイング
		student[0].setName(name1);
		student[0].setEnglishScore(englishScore1);
		student[0].setMathScore(mathScore1);

		//TestResultクラス型の配列の添字[1]の要素にオブジェクトを作成し、値を格納
		//以下にコーデイング
		student[1].setName(name2);
		student[1].setEnglishScore(englishScore2);
		student[1].setMathScore(mathScore2);

		//TestResultクラス型の配列の添字[2]の要素にオブジェクトを作成し、値を格納
		//以下にコーデイング
		student[2].setName(name3);
		student[2].setEnglishScore(englishScore3);
		student[2].setMathScore(mathScore3);

		//配列の要素数の回数だけfor文をまわし、取得した値を使って標準出力
		//以下にコーデイング		
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName() + "さんの英語の点数は" + student[i].getEnglishScore() + "点、数学の点数は"
					+ student[i].getMathScore() + "点です。");
		}
	}

}
