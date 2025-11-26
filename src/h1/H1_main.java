package h1;

public class H1_main {

	public static void main(String[] args) {

	}

	public static boolean isMirrorArray(int[] a, int[] b) {
		if (a.length == b.length) {
			for (int i = 0; i < a.length && i < b.length; i++) {
				int werta = a[i];
				if (werta - b[b.length - 1 - i] != 0) {
					return false;
				}
			}

			return true;

		} else {
			return false;
		}
	}

}
