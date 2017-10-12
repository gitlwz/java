package cn.itcast.properties配置文件类;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
需求：使用Properties实现本软件只能运行三次，超过三次之后就提示购买正版，退出jvm。



*/
public class a2配置练习 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\mypc\\learn\\fujian\\properties.properties");
		if(!file.exists()){
			//如果配置文件不存在，则创建该配置文件
			file.createNewFile();
		}
		//创建Properties
		Properties properties = new Properties();
		//把配置文件的信息加载到Properties
		properties.load( new FileInputStream(file));
		
		int count = 0; //定义该变量是用于保存软件的运行次数
		
		//读取配置文件的运行次数
		String value = properties.getProperty("count");
		
		if(value != null){
			count = Integer.parseInt(value);
		}
		
		//判断
		if(count == 3){
			System.out.println("你已超出了使用次数，请购买");
			System.exit(0);
		}
		count++;
		System.out.println("你已经使用了本软件第" + count + "次");
		properties.setProperty("count", count + "");
		
		//使用Properties生成一个配置文件
		properties.store(new FileWriter(file), "runtiome");
		
		
		
	}

}
