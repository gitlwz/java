package myself;
/*

 jdk1.5新特性之-----枚举
 
 问题：某些方法所接收的数据必须是在固定范围之内的， 
 
解决方案： 这时候我们的解决方案就是自定义一个类,然后是私有化构造函数，在自定义类中创建本类的对象对外使用。

jdk1.5对以上问题提出了新的解决方案： 就是使用枚举类解决。
	比如： 方向 , 性别 、 季节 、 星期......






 */
enum Gender{
	man("男"),woman("女");
	
	String value;
	
	private Gender(String value){
		this.value = value;
	}
}


class Person{
	
	private String name;
	
	private	Gender sex;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getSex() {
		return sex;
	}

	public void setSex(Gender sex) {
		this.sex = sex;
	}		
}
public class a6 {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("狗娃");
		p.setSex(Gender.man);
		System.out.println(p.getName() + p.getSex().value);
	}

}
