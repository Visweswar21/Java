package javaexamaple;

import java.util.ArrayList;
import java.util.Scanner;

public class addNamesList {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("Vishu");
		names.add("Uppendra");
		names.add("Pavan");
		names.add("Raghu");
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("Enter the name:");
			String input=s.next();
			if (input.equalsIgnoreCase("exit")) {
                break; // stop the loop
            }
			if(names.contains(input)) {
				System.out.println(names+ " Name is present");
			}else {
				if(names.add(input));
				System.out.println(input+ " Not in the List");
			}
			System.out.println("Updated List" +names);
			
		}
		
		
	}

}
