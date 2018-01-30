package agh.mwo.java3_1.agents;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.RandomAccessFile;

public class Main {

	public static String[] stringsToBeWritten = { "Joh Woo 001", "Robert Duval 002", "James Bond 007" };

	public static void main(String args[]) throws Exception {
		saveAgents(stringsToBeWritten, "res/cwiczenie3/special-agents.txt", true);
		modifyFile("res/cwiczenie3/special-agents.txt", "test");
		copyFiles();
	}

	private static void saveAgents(String[] agents, String filename, Boolean append) throws Exception {	
		PrintWriter PW = new PrintWriter(new FileOutputStream(
			    new File(filename), 
			    append));
		
		for (int i=0; i< agents.length; i++) {
			PW.println(agents[i]);
		}
		PW.close();
	}
	
	
	private static void modifyFile(String filename, String text) throws Exception {
		RandomAccessFile raf = new RandomAccessFile(filename, "rw");
		raf.seek(4);
		raf.writeBytes(text);
		raf.close();
	}
	
	private static void makeDirectories() {
		new File("res/cwiczenie3/agents/missing-agents").mkdirs();
	}
	
	private static void copyFiles() {
		Path sourcePath      = Paths.get("res/cwiczenie3/special-agents.txt");
		Path destinationPath = Paths.get("res/cwiczenie3/agents/missing-agents/special-agents.txt");

		try {
		    Files.copy(sourcePath, destinationPath);
//		    Files.delete(destinationPath);
		} catch(FileAlreadyExistsException e) {
		    //destination file already exists
		} catch (IOException e) {
		    //something else went wrong
		    e.printStackTrace();
		}
	}
}
