package cn.itcast.�ݹ�;
/*
�ݹ飺������������ú���������

�ݹ��ʹ��ǰ�᣺����Ҫ������������µ��á�


�������5�Ľ׳ˡ�5! = 5*4*3*2*1;

*/
public class a1�ݹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test(5));
	}
	public static int test2(int num) {
		if(num == 1){
			return 1;
		}else {
			return num*test(num-1);
		}
	}
	
	public static int test(int num) {
		int reuslt = 1;
		while(num > 0 ){
			reuslt = reuslt*num;
			num--;
		}
		return reuslt;
	}

}
