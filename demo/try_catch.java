//works!!
package try_catch;
import java.util.Scanner;

class tc {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try {
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[10]);
			} catch (Exception e) {
			System.out.println("Something went wrong.");
			} finally {
				System.out.println("The 'try catch' is finished.");
			}
	}
}
