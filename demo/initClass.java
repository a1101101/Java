//initializing a class with argument
import java.util.*;

class C{
	public int n;
	C(){this.n=0;}
	C(int n){this.n = n;}
}

class Main{
	public static void main(String[] args){
		System.out.printf("Input integer for initializing:");
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
				
		C c0 = new C();
		C c1 = new C(n);
		System.out.printf("c0.n = %d\n",c0.n);
		System.out.printf("c1.n = %d",c1.n);
	}
}