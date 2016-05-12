import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO01 {
	public static void dir(File fd) {
		// ���͸��� ���Ե� ���� ����Ʈ ���
		String[] filenames = fd.list(); 
		for (String s : filenames) {
			File f = new File(fd, s);
			long t = f.lastModified(); // ���������� ������ �ð�
			System.out.print(s);
			System.out.print("\t���� ũ��: " + f.length()); // ���� ũ��
			System.out.printf("\t������ �ð�: %tb %td %ta %tT\n",t, t, t, t);
		}		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f1 = new File("c:\\windows\\system.ini");
		File f2 = new File("c:\\tmp\\java_sample");
		File f3 = new File("c:\\tmp");
		String res;
		if(f1.isFile()) // ���� Ÿ���̸�
			res = "����";
		else // ���͸� Ÿ���̸�
			res = "���͸�";
		System.out.println(f1.getPath() + "�� " + res + "�Դϴ�.");
		if (!f2.exists()) { //f2�� ��Ÿ���� ������ �����ϴ��� �˻�
			if (!f2.mkdir()) // �������� ������ ���͸� ����
				System.out.println("���͸� ���� ����");
		}
		if(f2.isFile()) // ���� Ÿ���̸�
			res = "����";
		else // ���͸� Ÿ���̸�
			res = "���͸�";
		System.out.println(f2.getPath() + "�� " + res + "�Դϴ�.");
		dir(f3); // c:\tmp�� �ִ� ���ϰ� ���͸� ȭ�鿡 ���
		
		// ���� �̸� ����
		f2.renameTo(new File("c:\\tmp\\javasample")); 	
		dir(f3);

	}

}