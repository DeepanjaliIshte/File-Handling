import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
	File file=new File("C:\\New folder\\Java\\src\\Tea.java");
		
			FileReader fr=new FileReader(file);
			int d;
			while((d=fr.read())!=-1)
				System.out.println();
		
		}
		
	}


