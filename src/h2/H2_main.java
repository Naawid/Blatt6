package h2;

public class H2_main {
	public static void main(String[] args) {
		
	}

	public static boolean compareArrays(int[] a, int[] b) {

		if (a == null && b == null)
			return true;
		if (a == null || b == null)
			return false;
		
		if (a.length == b.length) {

			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
