import java.io.IOException;
import java.util.Scanner;

public class IntToHex {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner (System.in);
		try {
			while (scan.hasNextInt()) {
				int num = scan.nextInt();
				String hex = Integer.toHexString(num);
				System.out.println("Hexadecimal format: " + hex);
			}
			if (scan.nextLine() == "done") {
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println("Invalid input.");
		}	
	}
}
