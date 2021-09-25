public class thread_interface_other {

	public static void main(String[] args) {
		Runnable itc1=()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("In A");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable itc2=new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("In B");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		};
		
		
		 Thread t1=new Thread(itc1);
		 Thread t2=new Thread(itc2);
		 
		 t1.start();
		 try {Thread.sleep(10);}catch(Exception c) {};
		 t2.start();

	}

}
