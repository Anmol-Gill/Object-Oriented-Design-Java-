import java.util.*;
import java.io.*;

public class CreateFile {

	public static void main(String[] args) throws IOException{	
		try {
			Scanner scan = new Scanner(new File("command_line_input.txt"));
			while (scan.hasNextLine()) {
				String x = scan.nextLine();
				if (x.equals("@q")) {
					break;
				}
				System.out.println(x);
			}
		}
		catch (Exception e){
			System.out.println("Invalid input.");
		}
	}
}
