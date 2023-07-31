package SeleniumPractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedwritinginfile {

	public static void main(String[] args) throws IOException {

		FileWriter writer = new FileWriter("D:\\testout.txt");
		BufferedWriter buffer = new BufferedWriter(writer);
		buffer.write("Welcome to javaTpoint.");
		buffer.close();
		System.out.println("Success");
	}

}
