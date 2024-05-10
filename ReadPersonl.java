  import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadPersonl {

		public static void main(String[] args) throws IOException {
		File file=new File("C:\\New folder\\PersonalImformation.txt");
			
				FileReader fr=new FileReader(file);
				int d;
				StringBuilder check=new StringBuilder();
				while((d=fr.read())!=-1) {
					check.append((char)d);
				}
					System.out.print(check);
					String s=new String(check);
				if(s.contains("Atul")) {
					System.out.println("name avilabel");
				}else {
					System.out.println("not avilable");
				} 
			
			}
			 
		}



