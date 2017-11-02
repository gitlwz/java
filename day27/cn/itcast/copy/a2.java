package cn.itcast.copy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
对象的深克隆： 对象的深克隆就是利用对象的输入输出流把对象先写到文件上，然后再读取对象的
信息这个过程就称作为对象的深克隆。
	
	ObjectInputStream
	ObjectOutputStream 

 */
public class a2 {

	public static void main(String[] args) {
		Address address = new Address("广州");
		Person p1 = new Person(110,"狗娃",address);

	}
	//先要把对象写到文件上。
		public static void writeObj(Person p) throws IOException{
			//建立一个文件 的输出流对象
			FileOutputStream fileOutputStream  = new FileOutputStream("F:\\obj.txt");
			//建立对象的输出流
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			//把对象写出
			objectOutputStream.writeObject(p);
			//关闭资源
			objectOutputStream.close();
			
		}
}
