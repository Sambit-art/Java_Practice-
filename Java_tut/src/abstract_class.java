abstract class Writer{
	
	public abstract void name(String string);
	
	public void write() {
		System.out.println("writer");
	}
	
	
}

class Pencil extends Writer{
	public void name(String name) {
		System.out.println("hii user  "+name);
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}

	
}

class Pen extends Writer{
	public void write() {
		System.out.println("writer in pen ");
	}

	@Override
	public void name(String name) {
		System.out.println("Hii user "+name);
	}
	

}



public class abstract_class {

	public static void main(String[] args) {
		
//		Writer aPen=new Pen();
//		aPen.name("sambit");
		
		Writer writer=new Pen();
		writer.name("sambit");
		

	}

}
