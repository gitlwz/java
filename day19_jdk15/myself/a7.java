package myself;
/*
ö�٣�һЩ����������
 
ö����Ķ����ʽ��

 	enum ����{
 		ö��ֵ
 	}

ö��Ҫע���ϸ��
	1.ö����Ҳ��һ��������ࡣ
	2.ö��ֵĬ�ϵ����η���public static final
	3.ö��ֵ������������ö��ֵ���������������
	4.ö����Ĺ��췽��Ĭ�ϵ����η���private��
	5.ö������Զ����Լ��ĳ�Ա�������Ա������
	6. ö��������Զ��幹�캯�������ǹ��캯�������η�������private��
	7. ö������Դ��ڳ��� �ķ���������ö��ֵ����Ҫʵ�ֳ��� �ķ�����
	8. ö��ֵ����Ҫλ��ö���� �ĵ�һ����䡣
 
 */

//�Զ���һ��ö����
enum Sex{
	man("��"),woman("Ů");     //ö��ֵ
	
	String value;	//��Ա����
	
	//���캯��
	private Sex(String value){
		this.value = value;
	}
	
	//��Ա����
	public void getValue(){
		System.out.println(value);
	}
}


public class a7 {

	public static void main(String[] args) {
		Sex sex = Sex.man;
		sex.getValue();

	}

}
