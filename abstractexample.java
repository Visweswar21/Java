package javaexample;
abstract class car{
	abstract void start();
	abstract void drive();
	abstract void stop();
}

public  class abstractexample extends car {
	 public void start() {
		System.out.println("Car is starting");
	}
	public void drive() {
		 System.out.println(" i am driving");
	 }
	 public void stop() {
		 System.out.println("Stop the car");
	 }

	public static void main(String[] args) {
		abstractexample obj=new abstractexample();
		obj.start();
		obj.drive();
		obj.stop();
		// TODO Auto-generated method stub

	}

}
