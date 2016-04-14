import java.util.*;

public class LinkedList01 {
	static void printList(LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();
		while (iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if (iterator.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.print(e + separator);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList = new LinkedList();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0, "�͹̳�����");
		myList.add(2, "�ƹ�Ÿ");

		Collections.sort(myList);
		printList(myList); 

		Collections.reverse(myList);
		printList(myList); 

		int index = Collections.binarySearch(myList, "�ƹ�Ÿ") + 1;
		System.out.println("�ƹ�Ÿ�� " + index + "��° ����Դϴ�.");
	}

}
