import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class App {

	public static void main(String[] args) {
		//File Reader is the old way of reading files
		
		File file = new File("text.txt");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			
			while( (line = br.readLine())!= null) {
				System.out.println(line);
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
			
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}
		
		
		
	}

}
