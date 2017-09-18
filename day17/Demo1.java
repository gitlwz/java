import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeMap;




/*
需求：定义一个TreeMap ，键存储的是书的对象，值存储的是字符串。根据书的出版日期排序。


 */


class Book implements Comparable<Book>{
	String name;
	String data; //出版日期
	
	public Book(String name,String data) {
		this.name = name;
		this.data = data;
		// TODO Auto-generated constructor stub
	}
	/*
	 *利用了字符串的
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.data.compareTo(o.data);
	}
	*/	
	@Override
	public int compareTo(Book o) {
		
		SimpleDateFormat data = new SimpleDateFormat("yyyy-MM-dd");
		//使用日期格式化类把字符串转化成Date对象
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
		return "《 书名" + this.name + " 出版日期" + this.data + "》" ;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		TreeMap<Book, String> map = new TreeMap<Book, String>(); //值存储书名
		
		map.put(new Book("红楼梦","1990-12-03"),"001" );
		map.put(new Book("西游记","1993-08-13"),"002" );
		map.put(new Book("水浒传","1989-04-03"),"003" );
		map.put(new Book("三国演义","1997-10-04"),"004" );
		
		System.out.println(map);
	}

}
