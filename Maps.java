package week4;


	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Set;
	import java.util.SortedMap;
	import java.util.TreeMap;



	   

	    

	     Map<Integer,String> readFile() {

	        Map<Integer,String> map = new HashMap<>();

	        

	        try( BufferedReader br = new BufferedReader(new InputStreamReader(getClass().
	                              getClassLoader().getResourceAsStream("pairs.txt")));){
	            

	            String line = null;
	            while ((line = br.readLine()) != null) {
	                String[] pair = line.split(",");
	                if (pair.length==2) {
	                   map.put(Integer.valueOf(pair[0]), pair[1]);
	                } else {
	                   throw new Exception("Pair key must contain two elements");
	                }
	            }
	        } catch (Exception e) {
	            System.out.println("Error with the file: " + e.getMessage());
	        }

	        return map;
	    }


	    public static void main(String[] args) {


	        /*
	         * Solution #1 - Using a List to sort the entries by Key.
	         */
	        System.out.println("Solution #1");

	        /*
	         * Reads the file and creates a Map.
	         */
	        Map<Integer,String> map = new Maps().readFile();

	        /*
	         * Converts the Map into a Set of entries.
	         * Note.- A Map is comprised of key-value pairs (entries).
	         */
	        Set<Entry<Integer, String>> set = map.entrySet();

	        /*
	         * Converts the Set into a List.
	         */
	        List<Entry<Integer, String>> list = new ArrayList<>();
	        for(Entry<Integer, String> entry: set) {
	            list.add(entry);
	        }

	        /*
	         * Sort the list by Key using the Comparator class.
	         * Note.- Here we call the Collections class including the name of the package (java.util)
	         * to avoid conflicts with the customized class Collections we have in this package.
	         */
	        Collections.sort(list,new Comp());

	        /*
	         * Prints the sorted List.
	         */
	        for(Entry<Integer, String> entry: list) {
	            System.out.printf("K: %3d | V: %s%n",entry.getKey(),entry.getValue());
	            /*
	             * System.out.printf()
	             *
	             * %n  : new line.
	             * %3d : placeholder that represents a number with 3 digits.
	             * %s  : placeholder that represents a string.
	             *
	             * The %3d placeholder is replaced by entry.getKey(), the %s is replaced by entry.getValue()).
	             */
	        }

	        /*
	         * Solution #2 - Using a TreeMap.
	         */
	        System.out.println("\nSolution #2");

	        
	        SortedMap<Integer,String> treeMap = new TreeMap<>(map);

	        
	        for(Entry<Integer, String> entry: treeMap.entrySet()) {
	            System.out.printf("K: %3d | V: %s%n",entry.getKey(),entry.getValue());
	        }
	    }
	}

	
	class Comp implements Comparator<Entry<Integer, String>>{

	    @Override
	    public int compare(Entry<Integer, String> entry0, Entry<Integer, String> entry1) {
	        return entry0.getKey().compareTo(entry1.getKey());
	    }
	}


