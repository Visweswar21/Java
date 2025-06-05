package javaexamaple;
class Mytask extends Thread{
	private String taskname;
	public Mytask(String taskname) {
		this.taskname=taskname;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(taskname+"step"+i);
			try {
				Thread.sleep(5000);
			}catch(Exception e) {
				System.out.println(taskname+"was interruted.");
			}
		}
	}





	public static void main(String[] args) {
		Mytask t1=new Mytask("cooking");
		Mytask t2=new Mytask("washing");
		t1.start();
		t2.start();
		
	}}


