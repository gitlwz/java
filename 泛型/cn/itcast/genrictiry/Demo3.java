package cn.itcast.genrictiry;

/*

需求：编一个数组的工具类 

泛型类：

泛型类的定义格式：
	
	class 类名<声明自定义泛型>{
	
	}
  
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
