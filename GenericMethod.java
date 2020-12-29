package week4;


	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;

	public class GenericMethod {

	   
	    public static <E> void print(Collection<E> collection) {

	        for(E element: collection) {
	            System.out.println(element);
	        }
	    }

	    public static void main(String[] args) {

	        List<String> list = new ArrayList<>();
	        list.add("Red");
	        list.add("Blue");
	        list.add("Green");
	        list.add("Purple");
	        list.add("Brown");

	        Set<Integer> set = new HashSet<>();
	        set.add(4);
	        set.add(2);
	        set.add(8);
	        set.add(7);
	        set.add(9);

	        GenericMethod.print(list);
	        GenericMethod.print(set);
	    }
	}


