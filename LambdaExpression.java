package week4;


	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.HashMap;
	import java.util.Map;
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

	        
	        Map<Integer,String> map = new LambdaExpression().readFile();

	        
	        SortedMap<Integer,String> treeMap = new TreeMap<>(map);

	        
	        treeMap.forEach((k,v)-> System.out.printf("K: %3d | V: %s%n",k,v));
	        
	    }

	}
	


