
public class encapsulationExample {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name=newName;
	}
	public int getage() {
		return age;
	}
	public void setAge(int newAge) {
		if (newAge>0) {
			this.age=newAge;
	} else {
		System.out.println("Age must be positive:");
	}
}

	public static void main(String[] args) {
		encapsulationExample p=new encapsulationExample();
		p.setName("Viswa");
		p.setAge(21);
		System.out.println("Name:  "+p.getName());
		System.out.println("Age: "+p.getage());
		// TODO Auto-generated method stub

	}

}
