package javaname;

public class Revision {

	public static void main(String[] args) {
		int n=1234;
		while(n>0) {
		int rem=n%10;
		int c=0;
		for(int i=1;i<=rem;i++) {
			if(rem%i==0) {
				c++;
			}
		}
		System.out.println(c);
		if(c==2) {
			System.out.println(rem);
		}
	n=n/10;
		}
	}
}



