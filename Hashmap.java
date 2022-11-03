package myproj;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		map.put("c++",1);
		map.put("python",2);
		map.put("javascript",3);
		System.out.println("HashMap:"+map);
		map.remove("c++") ;
		System.out.println("Removed list:"+map);
		map.replace("python",3);
		System.out.println("Replaced list:"+map);


		Collection c1=map.keySet();
		System.out.println("keys:"+c1);
		Collection c2=map.values();
		System.out.println("Values:"+c2);
		Set s=map.entrySet();
		System.out.println(s);
	
		
		
	}

}
