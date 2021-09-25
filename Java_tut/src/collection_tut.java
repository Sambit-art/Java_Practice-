import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

//class myComparator implements Comparator<Integer>{
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		
//		if (o1>o2) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}
//	
//}

public class collection_tut {

	public static void main(String[] args) {
		List<Integer> values=new ArrayList<>();
		values.add(25);
		values.add(87);
		values.add(46);
		values.add(65);
		values.add(35);
		values.add(82);
		values.add(34);
//		myComparator mc=new myComparator();
		Comparator<Integer> mc= (Integer o1, Integer o2)-> {
				
			return o1>o2?1:-1;
		};
		values.sort(mc);
		for(Object i : values) {
			System.out.println(i);
		}
		
	}

}
