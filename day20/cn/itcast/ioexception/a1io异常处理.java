package cn.itcast.ioexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
IO异常的处理


*/
public class a1io异常处理 {
	public static void main(String[] args) {
		
	}
	//需求“把拷贝图片例子的代码处理一下异常
	public static void read1() {
		FileInputStream fileInputStream = null;
		try {
			//找到目标文件
			File file = new File("F:\\新建文件夹\\fileceshi\\a.txt");
			
			//建立数据的输入通道
			fileInputStream = new FileInputStream(file);
			byte[] buf = new byte[1024];
			
			int lenght = 0;
			while ((lenght = fileInputStream.read(buf)) != -1) {
				System.out.println(new String(buf,0,lenght));
			}
		} catch (IOException e) {
			System.out.println("读取文件");
			throw new RuntimeException(e);  //把IOException  传递给 RuntimeException包装一层，然后跑出，这样子做的目的是为了让调用者使用变的更加方便
		}finally{
			try {
				if(fileInputStream != null){
					fileInputStream.close();
					System.out.println("关闭资源成功");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("关闭资源失败");
				throw new RuntimeException(e);
			}
		}
		
//		//关闭资源
//		fileInputStream.close();
	}
}
