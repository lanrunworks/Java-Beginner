package lesson8;

class Student {
	public int li;
	public int ma;
	public int en;

	public void setScore(int l, int m, int e) {
		li = l;
		ma = m;
		en = e;
	}

	public void show() {
		System.out.println("国語:" + li + "\n数学:" + ma + "\n英語:" + en);
	}
}
