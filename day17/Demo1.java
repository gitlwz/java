import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeMap;




/*
���󣺶���һ��TreeMap �����洢������Ķ���ֵ�洢�����ַ�����������ĳ�����������


 */


class Book implements Comparable<Book>{
	String name;
	String data; //��������
	
	public Book(String name,String data) {
		this.name = name;
		this.data = data;
		// TODO Auto-generated constructor stub
	}
	/*
	 *�������ַ�����
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.data.compareTo(o.data);
	}
	*/	
	@Override
	public int compareTo(Book o) {
		
		SimpleDateFormat data = new SimpleDateFormat("yyyy-MM-dd");
		//ʹ�����ڸ�ʽ������ַ���ת����Date����
		Date date1 = null;
		Date date2 = null;
		
		try {
			date1 = data.parse(this.data);
			date2 =  data.parse(o.data);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return  date1.compareTo(date2);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�� ����" + this.name + " ��������" + this.data + "��" ;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		TreeMap<Book, String> map = new TreeMap<Book, String>(); //ֵ�洢����
		
		map.put(new Book("��¥��","1990-12-03"),"001" );
		map.put(new Book("���μ�","1993-08-13"),"002" );
		map.put(new Book("ˮ䰴�","1989-04-03"),"003" );
		map.put(new Book("��������","1997-10-04"),"004" );
		
		System.out.println(map);
	}

}
