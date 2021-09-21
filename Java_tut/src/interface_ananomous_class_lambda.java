
@FunctionalInterface
interface first{
	void write();
}


//interface first{
//	void write();
//	void read();
//}

//class Firstcls implements first{
//
//	@Override
//	public void write() {
//		System.err.println("i am write");
//		
//	}
//	
//}

public class interface_ananomous_class_lambda {

	public static void main(String[] args) {
//		first aFirstcls=new Firstcls();
//		aFirstcls.write();
		
		
//		ananomous class
//		first fs=new first() {
//			@Override
//			public void write() {
//				System.out.println("i am write from ananomous class");
//			}
//		};
//		fs.write();
		
//		lambda function
		
		first fs=()->System.out.println("i am from lambda function");
		fs.write();
		
		
	}

}
