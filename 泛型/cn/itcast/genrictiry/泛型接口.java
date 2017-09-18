package cn.itcast.genrictiry;

/*

泛型接口

泛型接口的定义格式：
	interface 接口名<生命自定义泛型>{
	
	}

泛型接口要注意的事项：
	1.接口上自定义的泛型的掘土数据类型是在实现一个接口的时候指定的。
	2.在接口上自定义的泛型如果在实现接口的时候没有指定具体的数据泛型，那么默认为Object类型
	
需求：目前实现一个接口的时候，还不明确目前要操作的数据类型，要等到创建接口实现类对象的时候才能指定泛型的具体数据类型
	如果要延长接口自定泛型 的具体数据类型，那么格式如下
	格式：
		public class 泛型接口<T> implements Dao<T>{
			
		}
 */

interface Dao<T>{
	
	public void add(T t);	
}


public class 泛型接口<T> implements Dao<T>  {

	
		public static void main(String[] args) {
			泛型接口<String> d = new 泛型接口<String>();
		}

		public void add(T t){
			
		}

	

}
