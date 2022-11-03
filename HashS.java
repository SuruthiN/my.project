package myproj;
import java.util.HashSet;
import java.util.Iterator;
public class HashS{


	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
			set.add("sruthi");
			set.add("nisha");
			set.add("ragu");
			Iterator<String>itr=set.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
	}
			}


