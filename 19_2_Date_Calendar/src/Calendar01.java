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
			strWeek = "��";
			break;
		case Calendar.TUESDAY:
			strWeek = "ȭ";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "��";
			break;
		case Calendar.THURSDAY:
			strWeek = "��";
			break;
		case Calendar.FRIDAY:
			strWeek = "��";
			break;
		case Calendar.SATURDAY:
			strWeek = "��";
			break;
		default:
			strWeek = "��";

		}
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm;
		if (amPm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}
		int hours = now.get(Calendar.HOUR);
		int minutes = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);

		System.out.println(year + "��" + month + "��" + date + "��");
		System.out.println(strWeek + "����");
		System.out.println(strAmPm + " " + hours + "��" + minutes + "��" + sec + "��");
	}
}
