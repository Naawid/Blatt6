package h3;

public class H3_main {
	public static void main(String[] args) {

	}

	public static boolean compareArraysVal(int[] a, int[] b) {
		if (a == null && b == null)
			return true;
		if (a == null || b == null)
			return false;
		if (a.length != b.length)
			return false;

		for (int i = 0; i < a.length; i++) {
			int value = a[i];
			int countA = 0;
			int countB = 0;

			for (int x : a) {
				if (x == value)
					countA++;
			}

			for (int x : b) {
				if (x == value)
					countB++;
			}

			if (countA != countB)
				return false;
		}

		return true;
	}

}