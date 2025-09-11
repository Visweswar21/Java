package javaexamaple;

public class p {
	public static void main(String[] args) {
		int n = 5;
		pattern(n);
	}
	static void pattern(int n) {
		for(int row=0;row<=n;row++) {
			for(int col=0;col<=n;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

