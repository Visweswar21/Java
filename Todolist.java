package javaexamaple;

import java.util.ArrayList;
import java.util.Scanner;

public class Todolist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> tasks=new ArrayList<>();
		while(true){
			System.out.println("simple todolistapp");
			System.out.println("1.Add a task:");
			System.out.println("2.view a task:");
			System.out.println("3.Delete a task:");
			System.out.println("4.exit");
			System.out.println("choose a option (1-4):");
			int choice =sc.nextInt();
			sc.nextLine();
			if(choice==1) {
				System.out.println("Enter your Task");
				String task=sc.nextLine();
				tasks.add(task);
				System.out.println("tasks added successfully");


			}
			else if(choice==2) {
				if(tasks.isEmpty()) {
					System.out.println("No task found");
				}
			else {
				System.out.println("your task");
				for(int i=0;i<tasks.size();i++){
				System.out.println((i+1)+"  "+ tasks.get(i));
				}


			}

		}
		// TODO Auto-generated method stub
	
	else if(choice==3) {
		if(tasks.isEmpty()) {
			System.out.println("nothing to delete");
		}
			int tasknum=sc.nextInt();
			if(tasknum>=1 && tasknum<=tasks.size()) {
				tasks.remove(tasknum-1);
				System.out.println("Task delete");
			}
			else {
				System.out.println("Invalid number");
			}
		}
	
	else if(choice==4) {
		System.out.println("GoodBye");
		break;
	}
	else {
		System.out.println("please choose a valid option");
	}
}
sc.close();




			}
		
	}


