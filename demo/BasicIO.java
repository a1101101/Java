package demo;
import java.util.Scanner;

class BasicIO{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(s);
		sc.close();
	}
}