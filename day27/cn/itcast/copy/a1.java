package cn.itcast.copy;
/*
����Ŀ�¡

	�����ǳ��¡:
		
		����ǳ��¡Ҫע���ϸ�ڣ�
			1.���һ��������Ҫ����clone�ķ�����¡����ô�ö��������������Ҫʵ��Cloneable�ӿڡ�
			2. Cloneable�ӿ�ֻ������һ����ʶ�ӿڶ��ѣ�û���κη�����
			3. �����ǳ��¡���ǿ�¡һ�������ʱ���������¡�Ķ�����ά��������һ����Ķ�����ʱ��ֻ�ǿ�¡����һ������ĵ�ַ����û�а�
 				����һ������Ҳ��¡һ�ݡ�
 			
	��������¡��
*/
public class a1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("����");
		
		Person p1 = new Person(110, "����",address);
		Person p2 = (Person) p1.clone();  //clone()��¡һ������
		p2.name = "xxx";
		
		p2.address.city = "��ɳ";
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
