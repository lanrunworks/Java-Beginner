package API;

public class Practice3 {

	public static void main(String[] args) {
		Double totalRange = Math.max(7D, 15) - Math.min(5, 8);
		Double sumOfRanges = (7D - 5) + (15 - 8);
		Double overlappingInterval = 0D;

		if (sumOfRanges > totalRange) { // means they overlap
		   overlappingInterval = Math.min(15D, 7) - Math.max(8, 5);
		}

		System.out.println(overlappingInterval);
	}

}