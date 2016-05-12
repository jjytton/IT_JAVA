import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO02 {
	public static void dir(File fd) {
		// 디렉터리에 포함된 파일 리스트 얻기
		String[] filenames = fd.list();
		for (String s : filenames) {
			File f = new File(fd, s);
			long t = f.lastModified(); // 마지막으로 수정된 시간
			System.out.print(s);
			System.out.print("\t파일 크기: " + f.length()); // 파일 크기
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t, t, t, t);
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//D:\\Java\\IT_JAVA\\23_IOPackage\\src
		String dirName="D:\\Java\\IT_JAVA\\23_IOPackage\\src";
		String fileName="IO02.java";
		
		File dir = new File(dirName); // 소스 파일
		File file = new File(dir,fileName); // 목적 파일
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
			System.out.println("파일 복사 오류");
		}

	}

}
