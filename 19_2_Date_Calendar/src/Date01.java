import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now=new Date();
		System.out.println(now.toString());
		
		SimpleDateFormat s=new SimpleDateFormat("yyyy�� MM�� dd�� mm�� ss��");
		String now2=s.format(now);
		System.out.println(now2);
	}

}
