import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Integers ints = new Integers();
			
		ArrayList <Integer> Collection = new ArrayList();
			
		Collection.add(1);
		Collection.add(2);
		Collection.add(3);
			
		System.out.println(Collection);
			
		System.out.println(ints.addSum(Collection));
	}

}
