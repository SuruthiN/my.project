package myproj;

import java.util.HashMap;
import java.util.Map;

public class Hash {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(1,"Apple");
		map.put(2, "orange");
		map.put(3, "grape");
		System.out.println("HashMap"+map);
	
	    HashMap<Integer,String>hm=new HashMap<Integer,String>();
	    hm.putAll(map);
	    System.out.println(""+hm);
	    for (Map.Entry<Integer,String>set:map.entrySet()) {
	    	System.out.println(set.getKey()+"="+set.getValue());
	    }
     }
}