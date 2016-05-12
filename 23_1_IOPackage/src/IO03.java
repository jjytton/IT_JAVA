import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO03 {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src = new File("c:\\windows\\explorer.exe"); // 소스 파일
		File dst = new File("c:\\tmp\\explorer.bin"); // 목적 파일
		FileInputStream fi = null;
		FileOutputStream fo = null;
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		int c;
		try {
			fi = new FileInputStream(src);
			fo = new FileOutputStream(dst); 
			in = new BufferedInputStream(fi); 
			out = new BufferedOutputStream(fo); 
			while ((c = in.read()) != -1) {
				out.write((char)c);
			}
			in.close();
			out.close();
			fi.close();
			fo.close();
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}

	}

}
