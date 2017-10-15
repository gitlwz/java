package cn.itcast.递归;
/*
递归：函数的自身调用函数的自身。

递归的使用前提：必须要有条件的情况下调用。


需求：算出5的阶乘。5! = 5*4*3*2*1;

*/
public class a1递归 {

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
