class NumRun{
	public static void name() {
		System.out.println("hello");
	}
}

class Intcls1 extends NumRun implements Runnable{
	public void run() {
		name();
		for (int i = 0; i < 5; i++) {
			System.out.println("In A");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Intcls2 implements Runnable{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("In B");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class thread_tutorial_with_thread_interface {

	public static void main(String[] args) {
		Runnable aa=new Intcls1();
		Intcls2 bb=new Intcls2();
		
		Thread t1=new Thread(aa);
		Thread t2=new Thread(bb);
		
		
		t1.start();
		try{Thread.sleep(10);} catch (Exception e) {		}
		t2.start();
		

	}

}
