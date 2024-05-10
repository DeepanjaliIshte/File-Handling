  
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonalInformation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\New folder\\PersonalImformation.txt");
		FileWriter fw=new FileWriter(file,true);
	
			//fw.write("Name: Atul Wakle ");
			//fw.write("\r\n Add.: At Narhe pune");
			//fw.write("\r\n Birth date: 06 feb 1999");
			fw.append("\r\n Course name = Java");
			
			System.out.println("File Created Succesfully");
			fw.close();
			
			}
		
		
				
	}

  