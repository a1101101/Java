import java.util.Scanner;
import java.lang.Integer;
import java.util.ArrayList;

class Array1{
	public static void main(String args[]){
		System.out.printf("Enter number of elements:");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		ArrayList<Integer> T = new ArrayList<Integer>();
		for(int i=0;i<n;i++){T.add(i+1);}
		for(int i=0;i<n;i++){System.out.printf("%d ",T.get(i));}
	}
}
