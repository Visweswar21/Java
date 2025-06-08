import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeMap;
class A{
	public A() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println(al);
	}
}
class B extends A{
	public B() {
		LinkedList<String>ll=new LinkedList<String>();
		ll.add("Viswa");
		ll.add("Vishnu");
		ll.add("Reddy");
		ll.add("Pavan");
		System.out.println(ll);
	}
}
class C extends B{
	public C() {
		HashSet<String> hs=new HashSet<String>();
		hs.add("Viswa");
		hs.add("Vishnu");
		hs.add("Reddy");
		hs.add("Mahi");
		System.out.println(hs);
		
	}
}
class D extends C{
	public D(){
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		tm.put("Mukka",1);
		tm.put("Vishu", 2);
		tm.put("Viswa",3);
		tm.put("Reddy", 4);
		System.out.println(tm);
		for(String item:tm.keySet()) {
        	System.out.println(item +"->"+tm.get(item));
        	
	}
}
}
public class AllListExample {

	public static void main(String[] args) {
		D b=new D();
		// TODO Auto-generated method stub

	}

}

