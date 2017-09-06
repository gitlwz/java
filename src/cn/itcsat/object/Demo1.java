package cn.itcsat.object;




/*
java�������������ԣ�����˼�룺�Һ��ʵĶ��������ʵ�����

	��ʽһ�������࣬Ȼ��ͨ���Զ�����۴�������
	
	��ʽ����sun�ṩ�˺ܶ���۸�����ʹ�ã�����ֻ��Ҫ��ʶ��Щ�࣬���ǾͿ���ͨ����Щ�ഴ�������ˡ�
	
	
	equals( Object obj );  ���ڱȽ�����������ڴ��ַ���ж����������Ƿ�Ϊͬһ������
	
	hashCode()   ���ظö���Ĺ�ϣ��ֵ(��ҿ��԰ѹ�ϣ��� �����Ƕ�����ڴ��ַ)
	java�淶  ���������д�� equals ���� ������д����hashCode����

*/
class Person{
	
	int id;
	
	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Person() {
	}
	
	//Ŀǰ����Ҫֱ�����һ�������ʱ����� �ĸ�ʽ�ǣ� ��ţ�110 ������ ����  ���ָ�ʽ�� ĿǰObject��
//	toString�����޷����������������ô��ʱ�����Ǿ�Ӧ�ö�Object���toString������д��
	@Override
	public String toString() {
		return "��ţ�"+ this.id + " ������"+this.name;
	}
	@Override
	public boolean equals(Object obj){
		Person p = (Person) obj;
		return this.id == p.id;
	}
	@Override
	public int hashCode(){
		return this.id;
	}
		
}
public class Demo1 {
	public static void main(String[] args) {
		Person p1 = new Person(110,"ѧ��1");
		Person p2 = new Person(110,"����");
		System.out.println(p1);
		
		//����ʵ������ֻҪ�����˵����֤��ͬ����ͬһ���ˡ�
		System.out.println("p1��p2��ͬһ��������" + p1.equals(p2));
		System.out.println("p1:"+ p1.hashCode());
		System.out.println("p2:" + p2.hashCode());
	}
}
