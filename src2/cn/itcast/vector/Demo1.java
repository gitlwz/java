package cn.itcast.vector;

import java.util.Vector;

/*


Vector   底层也是维护了一个Object的数组试下你的，实现与ArrayList是一样的，但是Vector是线程安全的

说出ArrayList与Vector的区别？
	相同点: ArrayList与Vector底层都是使用了Object数组实现的
	
	1. ArrayList是线程不同步的，操作效率高。 
	   Vector是线程同步的，操作效率低。
	2. ArrayList是JDK1.2出现，Vector是jdk1.0的时候出现的。


*/
public class Demo1 {

	public static void main(String[] args) {
		Vector v = new Vector();

	}

}
