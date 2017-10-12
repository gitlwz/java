package cn.itcast.properties配置文件类;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
Properties配置文件类 : 主要用于生产配置文件与读取配置文件的信息。

Properties要注意的细节：
	1.如果配置文件的信息一旦使用了中文，那么在使用store方法生成配置文件的时候只能使用字符流解决，如果使用字节流
		生成配置文件的话，默认使用的是iso8859-1码表进行编码存储的。这时候会出现乱码。
	
	2.如果Properties中的内容发生了变化，一定要重新使用Properties生成配置文件，否则配置文件信息不回发生变化。
	

*/
public class a1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
//		creatProperties();
		readProperties();
	}
	//读取配置文件的信息
	public static void readProperties() throws FileNotFoundException, IOException {
		//创建Properties对象
		Properties properties  = new Properties();
		
		//加载配置文件信息到Properties中
		properties.load(new FileReader("D:\\mypc\\learn\\fujian\\properties.properties"));
		Set<Map.Entry<Object, Object>> entries = properties.entrySet();
		for(Map.Entry<Object, Object> entry : entries){
			System.out.println("键："+entry.getKey() + " 值："+entry.getValue());
		}
		
		//修改狗娃的密码
		properties.setProperty("狗娃", "007");
		
		//把修改后的Properties再生成一个配置文件
		properties.store(new FileWriter("D:\\mypc\\learn\\fujian\\properties.properties") , "hehe");
	}
	
	//保存配置文件的信息
	public static void creatProperties() throws FileNotFoundException, IOException {
		//创建Properties
		Properties properties = new Properties();
		properties.setProperty("狗娃", "123");
		properties.setProperty("狗剩", "234");
		properties.setProperty("铁蛋", "345");
		
		/*
		
		Set<Map.Entry<Object, Object>> entries = properties.entrySet();
		for(Map.Entry<Object, Object> entry : entries){
			System.out.println("键："+entry.getKey() + " 值："+entry.getValue());
		}
		
		*/
		
		//properties.store(new FileOutputStream("D:\\mypc\\learn\\fujian\\properties.properties"), "哈哈");//第一个参数是一个输出流对象，第二参数是使用一个字符串描述一个
		properties.store(new FileWriter("D:\\mypc\\learn\\fujian\\properties.properties"),"哈哈");
	}
}
