
public class Operator10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		ch = 'E';

		String str = "";
		str = (ch >= 'a' && ch <= 'z') ? "소문자" : str;
		str = (ch >= 'A' && ch <= 'Z') ? "대문자" : str;
		str = (ch >= '0' && ch <= '9') ? "숫자" : str;

		System.out.println("" + ch + "는 " + str + " 입니다");

		char ch2 = (char) ((ch >= 'a' && ch <= 'z') ? ch - ('a' - 'A') : ch + ('a' - 'A'));
		System.out.println(ch + " -->" + ch2);
	}

}
