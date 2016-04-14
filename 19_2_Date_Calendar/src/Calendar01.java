import java.util.Calendar;

public class Calendar01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int date = now.get(Calendar.DATE);

		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		default:
			strWeek = "일";

		}
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		int hours = now.get(Calendar.HOUR);
		int minutes = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);

		System.out.println(year + "년" + month + "월" + date + "일");
		System.out.println(strWeek + "요일");
		System.out.println(strAmPm + " " + hours + "시" + minutes + "분" + sec + "초");
	}
}
