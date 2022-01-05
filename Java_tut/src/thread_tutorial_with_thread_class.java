class Cls1 extends Thread{
	public void run() {
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

class Cls2 extends Thread{
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

class Cls3 extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("In C");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class thread_tutorial_with_thread_class {

	public static void main(String[] args) throws InterruptedException {
		Cls1 aa=new Cls1();
		Cls2 bb=new Cls2();
		Cls3 cc=new Cls3();
		
		aa.start();
		Thread.sleep(10);
		bb.start();
		Thread.sleep(10);
		cc.start();
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
