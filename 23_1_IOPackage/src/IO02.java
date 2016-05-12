import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO02 {
	public static void dir(File fd) {
		// ���͸��� ���Ե� ���� ����Ʈ ���
		String[] filenames = fd.list();
		for (String s : filenames) {
			File f = new File(fd, s);
			long t = f.lastModified(); // ���������� ������ �ð�
			System.out.print(s);
			System.out.print("\t���� ũ��: " + f.length()); // ���� ũ��
			System.out.printf("\t������ �ð�: %tb %td %ta %tT\n", t, t, t, t);
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//D:\\Java\\IT_JAVA\\23_IOPackage\\src
		String dirName="D:\\Java\\IT_JAVA\\23_IOPackage\\src";
		String fileName="IO02.java";
		
		File dir = new File(dirName); // �ҽ� ����
		File file = new File(dir,fileName); // ���� ����
		FileInputStream fi = null;
		InputStreamReader isr=null;
		BufferedReader in = null;
		int c;
		try {
			fi = new FileInputStream(file);
			isr=new InputStreamReader(fi);
			in = new BufferedReader(isr);
			String contents=null;
			while ((contents = in.readLine()) != null) {
				System.out.println(contents);
			}
			in.close();
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}

	}

}
