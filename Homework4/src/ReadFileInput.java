import java.util.*;
import java.io.*;
public class ReadFileInput {

	public static void main(String[] args) throws IOException {
		try {
			Scanner scan = new Scanner(new File("quote.txt"));
			while (scan.hasNextLine()) {
				String x = scan.nextLine();
				System.out.println(x);
				if (x.length() == 0) {
					System.exit(0);
				}
			}
		} catch (Exception e) {
			System.out.println("Invalid input.");
		}
	}
}
