
public class Operator10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		ch = 'E';

		String str = "";
		str = (ch >= 'a' && ch <= 'z') ? "�ҹ���" : str;
		str = (ch >= 'A' && ch <= 'Z') ? "�빮��" : str;
		str = (ch >= '0' && ch <= '9') ? "����" : str;

		System.out.println("" + ch + "�� " + str + " �Դϴ�");

		char ch2 = (char) ((ch >= 'a' && ch <= 'z') ? ch - ('a' - 'A') : ch + ('a' - 'A'));
		System.out.println(ch + " -->" + ch2);
	}

}
