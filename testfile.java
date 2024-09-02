import java.util.Scanner;
import java.util.InputMismatchException;
public class testfile {
	public static void main(String[] args) {
		final double COMM_RATE=0.1;
		double sales,commission;
		Scanner key = new Scanner(System.in);
		try {
			//If any error happens within the try statement, the code will jump to catch
			//get the amount of sales
			System.out.println("Get the sale");
			sales=key.nextDouble();
			//calculate the commission
			commission=sales*COMM_RATE;
			System.out.print(commission);
		}
		catch(InputMismatchException e) {
			System.out.println("Enter a valid number.");
		}
	}
}
