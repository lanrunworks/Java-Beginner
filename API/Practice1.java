package API;

public class Practice1 {

	public static void main(String[] args) {
		//		String[] s = new String[100];
		//		String[] a = new String[100];
		//		for (int i = 0; i < a.length; i++) {
		//
		//			if (i == a.length-1)
		//				s[i] = String.valueOf(i+1);
		//			else
		//				s[i] = String.valueOf((i+1) + ",");
		//
		//			a[i] = s[i];
		//			System.out.print(a[i]);
		//		}
		//

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 100; i++) {
			StringBuilder sb2 = new StringBuilder();
			sb2 = sb.append(i + 1);
			sb2.append(",");
			//sb.append(i+1).append(",");
		}
		String s = sb.toString();
		String[] a = s.split(",");
	}
}
