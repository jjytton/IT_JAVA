
public class Sum {
	public int allsum(int n, int m) {
		int sum = 0;
		for (int i = n; i <= m; i++) {
			sum += i;
		}
		return sum;
	}
	public int evensum(int n, int m) {
		int sum = 0;
		for (int i = (n%2==0)?n:n+1; i <= m; i+=2) {
			sum += i;
		}
		return sum;
	}
	public int oddsum(int n, int m) {
		int sum = 0;
		for (int i = (n%2==1)?n:n+1; i <= m; i+=2) {
			sum += i;
		}
		return sum;
	}
}
