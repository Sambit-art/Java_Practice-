import java.util.ArrayList;
import java.util.Collection;

public class collection_Api {

	public static void main(String[] args) {
		
		Collection<Integer> item= new ArrayList <>();
		item.add(25);
		item.add(6582);
//		for(int  args1 : item) {
//			System.out.println(args1);
//		}
//		System.out.println(item.size());
		
		ArrayList<Integer> a2=new ArrayList<>(item);
		a2.add(5445);
		System.out.println(a2);
		System.out.println(a2.indexOf(6582));
//		Object[] arr=a2.toArray();
//		for(Object a:arr) {
//			System.out.println(a.toString());
//		}
	}

}
