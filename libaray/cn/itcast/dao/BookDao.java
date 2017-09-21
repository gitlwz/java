package cn.itcast.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import cn.itcast.model.Book;

//����������
class PriceSort implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		return (int)(o1.getPrice() - o2.getPrice());
	}	
}
//����������
class AuthorSort implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.getAuthor().compareTo(o2.getAuthor());
	}	
}
//����������
class DateSort implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return  Date.valueOf(o1.getPublicationDate()).compareTo(Date.valueOf(o2.getPublicationDate()));
	}	
}
//�����鱾����ɾ�Ĳ�
public class BookDao {
	private static ArrayList<Book> Books = new ArrayList<Book>();
	//û�в�ѯ����������ȫ��
	public void query() {
		System.out.println("|����|\t|����|\t|������|\t|�۸�|\t|���|\t|��������|");
		System.out.println(Books);
	}
	
	
	
	//ͼ��Ĳ�ѯ
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
			System.out.println("��������....");
		}
	}
	
	
	//ͼ������
	public void booksAdd() {
		System.out.println("���ͼ��");
		Scanner scanner = new Scanner(System.in);
		String bookName = null;
		String author = null;
		String press = null;
		double price;
		String bookNumber = null;
		String publicationDate = null;
		
		System.out.println("����������:");  //�������
		bookName = scanner.next();
			
		System.out.println("����������:");  //����
		author = scanner.next();
		
		
		System.out.println("�����������:");  //������
		press = scanner.next();
			
		
		System.out.println("������۸�:");  //�۸�
		price = scanner.nextDouble();
			
		
		System.out.println("���������:");  //���
		bookNumber = scanner.next();
			
		while(true){
			System.out.println("���������:");  //��������
			publicationDate = scanner.next();
			if(publicationDate.matches("[1-9][0-9]{3}-[0-9]{1,2}-[0-9]{1,2}")){
				break;
			}else {
				System.out.println("��������ȷ�����ڸ�ʽ");
			}
			
		}
		
		System.out.println("������Ϣ���£�" + bookName +"/t" + author+"/t" + press+"/t" + price+"/t" + bookNumber+"/t" + publicationDate);
		System.out.println("�Ƿ񱣴����      ��y����        ��N����");
		String flag = scanner.next();
		if("y".equalsIgnoreCase(flag)){
			Book book = new Book(bookName,author,press,price,bookNumber,publicationDate);
			Books.add(book);
			System.out.println("��ӳɹ�");
			this.query();
		}
	}
}
