package cn.itcast.对象存储;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
对象的输入输出流 ： 对象的输入输出流主要的作用是用于写对象的信息与读取对象的信息。对象信息一旦

对象的输出流：ObjectOutputStream；

对象的输入流：ObjectInputStream


ObjectOutputStream的使用步骤
	1.
	
	
对象输入输出流要注意的细节
	1.如果对象需要被写出到文件上，那么对象所属的类必须要实现Serializable接口。 Serializable接口没有任何的方法，是一个标识接口而已。
	
	2.对象的反序列化创建对象的时候并不会调用到构造方法的
	
	3.serialVersionUID,是用记录class文件的版本信息的，serialVersionUID这个数字是通过一个类的类名、成员、包名、工程名算出来的一个数字
	
	4.使用ObjectOutputStream反序列化的时候，ObjectOutputStream会先读取文件中的serialVersionUID，然后与本地的class文件的serialVersionUID
		进行对比，如果这两个id不一致，就会反序列失败。
		
	5.如果序列化与反序列化的时候可能会修改类的成员，那么最好一开始就给这个类制定一个serialVersionUID，如果一个类已经指定了serialVersionUID。
		在序列化与反序列化的时候,jvm都不会再自己算这个class的serialVersionUID了。
		
	6.如果一个对象某个 数据不想被序列化到硬盘上，可以使用关键字transient修饰。
	
	7.如果一个类维护了另外一个类的引用，那么另外一个类也需要实现serialVersionUID接口。
*/
class Adderss{
	String country;
	String city;
	
	public Adderss(String country, String city){
		this.country = country;
		this.city = city;
	}
}


class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String userName;
	
	String password;
	
	transient int age;  //transient 透明
	
	
	public User(String userName,String password ){
		this.userName = userName;
		this.password = password;
		
	}
	public User(String userName,String password,int age ){
		this.userName = userName;
		this.password = password;
		this.age = age;
	}
	@Override
	public String toString() {
		return "账号："+this.userName+"   密码："+ this.password + " 年龄：" + this.age;
	}
}




public class a1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		writeObj();
		readObj();
	}
	//把文件中的对象信息读取出来---------》对象的反序列化
	public  static void readObj() throws IOException, ClassNotFoundException {
		//找到目标文件
		File file = new File("D:\\mypc\\learn\\fujian\\obj.txt");
		
		//建立数据逇输入通道
		FileInputStream fileInputStream = new FileInputStream(file);
		
		//建立对象的输入流对象
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		//读取对象信息
		 User user =  (User)objectInputStream.readObject();//创建对象肯定要依赖对象所属的class文件。
		
		 
		 System.out.println(user);
		
	}
	
	
	
	//定义方法把对象的信息写到硬盘上
	//这个过程也称作----》对象的序列化。
	public  static void writeObj() throws IOException {
		User user = new User("张三", "123");
		
		//找到目标文件
		File file = new File("D:\\mypc\\learn\\fujian\\obj.txt");
		
		//建立数据输入流对象
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		//建立对象的输出流对象
		ObjectOutputStream  objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		//把对象写出
		objectOutputStream.writeObject(user);
		
		//关闭通道
		objectOutputStream.close();
	}

}
