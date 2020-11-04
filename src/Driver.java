import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		int[] arrayOne ={1,-3,2,5,2,1} ;
		
		for(int i=0; i<arrayOne.length; ++i) {
			list.add(arrayOne[i]);
		}
		
		Set<Integer> set = new HashSet<Integer>();
		
		Set<Integer> setTwo = new HashSet<Integer>(list);

		set.add(1);
		set.add(1);
		set.add(5);
		for(int i=0; i<list.size(); ++i) {
			if(set.contains(list.get(i))) {
				System.out.println("Found it");
				
			}
			
		}
		setTwo.forEach(p-> System.out.println(p));
	
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		int[]array= {5, -3, 1, 2,-2}; 
        for (int x: array)  
        {  
            hm.put(x, Integer.toString(x));  
        }  
        for (int k: hm.keySet()) 
        { 
            System.out.print(k + ", ");  
        } 
				
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        for (int x: array)  
        {  
            tm.put(x, Integer.toString(x));  
        }  
        for (int k: tm.keySet()) 
        { 
            System.out.print(k + ", ");  
        } 
	}

}
