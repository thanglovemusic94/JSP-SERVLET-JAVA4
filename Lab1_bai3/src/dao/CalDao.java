package dao;

public class CalDao {

	public static int cong(String a, String b) {
		return Integer.parseInt(a) + Integer.parseInt(b);
	}

	public static int tru(String a, String b) {
		return Integer.parseInt(a) - Integer.parseInt(b);
	}

	public static int nhan(String a, String b) {
		return Integer.parseInt(a) * Integer.parseInt(b);
	}

	public static int chia(String a, String b) {
		return Integer.parseInt(a) / Integer.parseInt(b);
	}

	public static boolean check(String a, String b) {
		if ((a != null && a.length() > 0 && a.length() <= 10 && a.matches("\\d+"))
				&& (b != null && b.length() > 0 && b.length() <= 10 && b.matches("\\d+"))) {
			return true;
		}
		return false;
	}

}
