package lesson8;

class Student2 {
	public int li;
	public int ma;
	public int en;

	public void setScore(int l, int m, int e) {
		li = l;
		ma = m;
		en = e;
	}

	public void show() {
		int sum = li + ma + en;
		System.out.println("各教科の得点をセットしました。\n国語:" + li + "\n数学:" + ma + "\n英語:" + en + "\n合計:" + sum);
	}
}
