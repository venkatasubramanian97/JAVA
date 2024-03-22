package FILE_HANDLING;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFolder {
	public static void main(String[] args) throws IOException {
		String fol = "D:\\File Handlind\\Folder Create\\File create.txt";
		File folder=new File(fol);
		boolean sreach=folder.exists();
		if(sreach)
			System.out.println("Already folder create");
		else {
			boolean create=folder.mkdirs();
			if(create)
				System.out.println("Folder create successfully");
		}
			File file=new File(fol);
			boolean sreaching=file.exists();
			if(sreaching)
				System.out.println("Already file create");
			else {
				boolean create=file.createNewFile();
				if(create)
					System.out.println("file is create");
			}
//		File file = new File(fol);
		FileWriter writer = new FileWriter(file);
		writer.write("java file handline program ");
		writer.append("how to create file");
		writer.flush();
		writer.close();

		try (FileReader filereader = new FileReader(file)) {
			int output = filereader.read();
			while (output != -1) {
				System.out.print((char)output);
				output = filereader.read();
			}
		}
	}
}