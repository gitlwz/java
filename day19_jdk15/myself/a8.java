package myself;
/*
switch ʹ�õ��������ͣ�byte��char��short��int��String��ö����

ע�⣺
	case���������ö��ֵ��ֻ��Ҫ��дö��ֵ���ɣ�����Ҫ�������� ö��ֵ�������ĸ�ö����ġ�

 */

//����ö����
enum Season{
	spring,summer,autumn,winter;
	
}



public class a8 {

	public static void main(String[] args) {
		Season season = Season.winter;
		System.out.println(season);
		switch (season) {
		case spring:
			System.out.println("����");
			break;
		case summer:
			System.out.println("����");
			break;
		case autumn:
			System.out.println("����");
			break;
		case winter:
			System.out.println("����");
			break;
		default:
			break;
		}
		
	}

}
