import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrittenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\New folder\\sample.txt");
		try {
			FileWriter fw=new FileWriter(file);
			fw.write("hello friend how are you and what are you doing...!");
			System.out.println("File Created Succesfully");
			fw.close();
			 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
