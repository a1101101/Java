import java.util.Scanner;

interface Face{
	public int func(int n);
}

class ClassA implements Face{
	public int func(int n){
		System.out.println("hi");
		return n;
	}
}

class ClassM{
	public static void main(String[] args){
		ClassA a = new ClassA();
		int i = a.func(1);
	}
}
