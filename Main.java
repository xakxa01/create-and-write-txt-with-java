import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;

public class Main {
	static String scannerPrint(Scanner scanner, String alert) {
		System.out.println(alert);
		return scanner.nextLine();
	};

	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		String inputFileName = scannerPrint(scanner, "enter your file name");
		File myFile = new File("./files/" + inputFileName + ".txt");

		try {
			if (myFile.createNewFile() && myFile.canWrite()) {
				String inputWriterFile = scannerPrint(scanner, "enter your text in your file");
				FileWriter writeMyFile = new FileWriter(myFile);

				writeMyFile.write(inputWriterFile);
				System.out.println("file created");
				writeMyFile.close();
			} else {
				System.err.println("file exists or is not created");
			}
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
