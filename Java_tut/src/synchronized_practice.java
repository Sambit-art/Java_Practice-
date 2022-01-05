class Counter {
	int count = 0;

	public synchronized void inc() {
		count++;
	}
}

public class synchronized_practice {

	public static void main(String[] args) throws Exception {

		Counter count = new Counter();
//		count.inc();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					count.inc();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					count.inc();
				}

			}
		});

		t1.start();
		
		Thread.sleep(100);
		t2.start();
//		System.out.println(t1.isAlive());
		t1.join();
		t2.join();
//		System.out.println(t1.isAlive());
		System.out.println(count.count);
		
		
		System.out.println(t1.getId());
//		t1.setName("first");
//		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
	}

}
