package javaexamaple;
import java.util.HashMap;
public class HASHMAP {
	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<>();
		hs.put(1,"Sumanth");
		hs.put(2,"Vishnu");
		hs.put(3,"Viswa");
		hs.put(4,"Shreedhar");
		System.out.println(hs);
		hs.remove(2);
		System.out.println(hs);
		hs.put(2,"Mukka");
		System.out.println(hs);
		System.out.println(hs.containsKey(5));
		System.out.println(hs.containsKey(4));
		System.out.println(hs.containsValue("Viswa"));


		
	}

}
