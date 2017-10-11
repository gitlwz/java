package cn.itcast.装饰者设计模式;
/*练习：
一家三口每个人都会工作，儿子的工作就是画画，母亲的工作就是在儿子的基础上做一个增强，不单止可以画画，还可以上涂料。
爸爸的工作就是在妈妈基础上做了增强，就是上画框。
*/

interface Work {
	public void work();
}

class Son implements Work{
	@Override
	public void work() {
		System.out.println("画画。。。。。");
		
	}
}

class Mather implements Work{
	Work work;
	
	public Mather (Work work) {
		this.work = work;
	}

	@Override
	public void work() {
		this.work.work();
		System.out.println("给画上颜色....");
	}
}

class Father implements Work{
	
	Work work;
	public Father(Work work) {
		this.work = work;
	}
	
	@Override
	public void work() {
		work.work();
		System.out.println("上画框.....");
	}
	
}




public class a3作业 {

	public static void main(String[] args) {
		
		Son s = new Son();
		
//		s.work();
		
		Mather mather = new Mather(s);
		
//		mather.work();
		
		
		Father father = new Father(mather);
		father.work();
		
	}

}


