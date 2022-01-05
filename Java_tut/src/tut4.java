class clsA{
	
	public clsA() {
		System.out.println("clsA constructer running");
	}
	
	public clsA(int age) {
		System.out.println("clsA constructer age  "+age);
	}
	
	public void hlwname(String name) {
		System.out.println("hello  "+name);
	}
	
	public void funcoverwrit(String name) {
		System.out.println(name+"  from clsA");
	}
}

class clsB extends clsA
{
	public clsB() {
		super(98);
		System.out.println("clsB constructer running");
	}
	
	public clsB(int age) {
		super(45);
		System.out.println("clsB constructer age  "+age);
	}
	
	public void hiname(String name) {
		System.out.println("hii   "+name);
	}
	
	@Override
	public void funcoverwrit(String name) {
		System.out.println(name+"  from clsB");
	}
	
}


public class tut4 {

	public static void main(String[] args) {
		
		clsB obj1=new clsB();
//		clsB obj1=new clsB(12);
//		obj1.hiname("sambit");
//		obj1.hlwname("bony");
//		obj1.funcoverwrit("overwrite");
	}

}
