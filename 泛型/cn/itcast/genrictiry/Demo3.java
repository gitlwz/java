package cn.itcast.genrictiry;

/*

���󣺱�һ������Ĺ����� 

�����ࣺ

������Ķ����ʽ��
	
	class ����<�����Զ��巺��>{
	
	}
	
������Ҫע������
	1.�������Զ��巺�͵ľ���������������ʹ�ø����ʱ�򴴽�����ʱ��ȷ���ġ�
	2.���һ�����������Ѿ��������Զ��巺�ͣ����ʹ�ø��ഴ������ ��ʱ��û��ָ�� ���͵ľ����������ͣ���ôĬ��ΪObject����
	3.�������Զ��巺�Ͳ��������ھ�̬�ķ����������̬�ķ�����Ҫʹ���Զ��巺�ͣ���ô��Ҫ�ڷ������Լ�����ʹ�á�

 */

class MyArrays{
	
	
	public <T>void reverse(T[] arr) {
		for(int startIndex = 0, endIndex = arr.length-1 ; startIndex<endIndex ; startIndex++,endIndex--){
			T temp  = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}

	}
	
	public <T> String toString(T[] arr){
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < arr.length ; i++){
			if(i==0){
				sb.append("["+arr[i]+",");
			}else if(i==arr.length-1){
				sb.append(arr[i]+"]");
			}else{
				sb.append(arr[i]+",");
			}
		}
		return sb.toString();
	}
}

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
