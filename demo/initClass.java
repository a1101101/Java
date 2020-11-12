//initializing a class with argument
import java.util.*;

class C{
	public int n=0;
	
	C(){}
	C(int n){this.n = n;}
	public void set(int a){
		this.n = a;
		return;
	}
}

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
				
		C c = new C(n);
		System.out.printf("C.n = %d.",c.n);
	}
}