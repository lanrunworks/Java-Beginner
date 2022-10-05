package lesson8;

class Student3 {
	public int li;
	public int ma;
	public int en;

	public void setScore(int l, int m, int e) {
		li = l;
		ma = m;
		en = e;
	}

	public void getTotal() {
		int sum = li + ma + en;
		System.out.println("各教科の得点をセットしました。\n合計:" + sum);
	}
}
