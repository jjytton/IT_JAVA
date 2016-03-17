
public class Operator06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 5;
		boolean result;

		result = n1 > n2;

		System.out.printf("%d %c %d = %b\n", n1, '>', n2, result);

		result = n1 < n2;

		System.out.printf("%d %c %d = %b\n", n1, '<', n2, result);

		result = n1 >= n2;

		System.out.printf("%d %s %d = %b\n", n1, ">=", n2, result);

		result = n1 <= n2;

		System.out.printf("%d %s %d = %b\n", n1, "<=", n2, result);

		result = n1 == n2;

		System.out.printf("%d %s %d = %b\n", n1, "==", n2, result);

		result = n1 != n2;

		System.out.printf("%d %s %d = %b\n", n1, "!=", n2, result);

	}

}
