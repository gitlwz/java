package myself;
/*

 jdk1.5������֮-----ö��
 
 ���⣺ĳЩ���������յ����ݱ������ڹ̶���Χ֮�ڵģ� 
 
��������� ��ʱ�����ǵĽ�����������Զ���һ����,Ȼ����˽�л����캯�������Զ������д�������Ķ������ʹ�á�

jdk1.5����������������µĽ�������� ����ʹ��ö��������
	���磺 ���� , �Ա� �� ���� �� ����......






 */
enum Gender{
	man("��"),woman("Ů");
	
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
		p.setName("����");
		p.setSex(Gender.man);
		System.out.println(p.getName() + p.getSex().value);
	}

}
