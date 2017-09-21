package cn.itcast.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import cn.itcast.model.Book;

//按单价排序
class PriceSort implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		return (int)(o1.getPrice() - o2.getPrice());
	}	
}
//按作者排序
class AuthorSort implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.getAuthor().compareTo(o2.getAuthor());
	}	
}
//按日期排序
class DateSort implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return  Date.valueOf(o1.getPublicationDate()).compareTo(Date.valueOf(o2.getPublicationDate()));
	}	
}
//处理书本的增删改查
public class BookDao {
	private static ArrayList<Book> Books = new ArrayList<Book>();
	//没有查询条件，返回全部
	public void query() {
		System.out.println("|书名|\t|作者|\t|出版社|\t|价格|\t|书号|\t|出版日期|");
		System.out.println(Books);
	}
	
	
	
	//图书的查询
	public void booksSort(String option) {
		if("a".equalsIgnoreCase(option)){
			Collections.sort(Books,new PriceSort());
			System.out.println(Books);
		}else if("B".equalsIgnoreCase(option)){
			Collections.sort(Books,new AuthorSort());
			System.out.println(Books);
		}else if("c".equalsIgnoreCase(option)){
			Collections.sort(Books,new DateSort());
			System.out.println(Books);
		}else {
			System.out.println("输入有误....");
		}
	}
	
	
	//图书的添加
	public void booksAdd() {
		System.out.println("添加图书");
		Scanner scanner = new Scanner(System.in);
		String bookName = null;
		String author = null;
		String press = null;
		double price;
		String bookNumber = null;
		String publicationDate = null;
		
		System.out.println("请输入书名:");  //添加书名
		bookName = scanner.next();
			
		System.out.println("请输入作者:");  //作者
		author = scanner.next();
		
		
		System.out.println("请输入出版社:");  //出版社
		press = scanner.next();
			
		
		System.out.println("请输入价格:");  //价格
		price = scanner.nextDouble();
			
		
		System.out.println("请输入书号:");  //书号
		bookNumber = scanner.next();
			
		while(true){
			System.out.println("请输入书号:");  //出版日期
			publicationDate = scanner.next();
			if(publicationDate.matches("[1-9][0-9]{3}-[0-9]{1,2}-[0-9]{1,2}")){
				break;
			}else {
				System.out.println("请输入正确的日期格式");
			}
			
		}
		
		System.out.println("新书信息如下：" + bookName +"/t" + author+"/t" + press+"/t" + price+"/t" + bookNumber+"/t" + publicationDate);
		System.out.println("是否保存该书      （y）是        （N）否");
		String flag = scanner.next();
		if("y".equalsIgnoreCase(flag)){
			Book book = new Book(bookName,author,press,price,bookNumber,publicationDate);
			Books.add(book);
			System.out.println("添加成功");
			this.query();
		}
	}
}
