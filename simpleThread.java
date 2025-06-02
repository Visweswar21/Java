package javaexamaple;

class Car extends Thread {
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Car moving"+i);
		    try {
			Thread.sleep(500);
		}catch(Exception e) {
		
	}
}
}
}
class Bike extends Thread {
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Bike moving"+i);
		    try {
			Thread.sleep(500);
		}catch(Exception e) {
		}
		}
}}

public class simpleThread {
	public static void main(String[] args) {
		Car c=new Car();
		Bike b=new Bike();
		c.start();
		b.start();
	}

}
