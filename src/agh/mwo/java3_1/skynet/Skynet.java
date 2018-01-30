package agh.mwo.java3_1.skynet;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Skynet {
	
	private String login = "Reese";
	private String password = "#Terminate";
	Scanner scanner = new Scanner(System.in);
		
	public static void main(String args[]) {
		Skynet skynet = new Skynet();
		skynet.run();
	}
	
	public void run() {
		readCredentials();
		printSkyNetLogo();
		runLoginPanel();
	}
	
	private void runLoginPanel() {
		String readLogin;
		String readPassword;
		boolean credentialsOK;
		do {
			readLogin = getTextFromInput("Login");
			readPassword = getTextFromInput("Password");
			credentialsOK = verifyCredentials(readLogin, readPassword); 
			if (!credentialsOK) {
				System.out.println("Wrong login or password. Try again.");
			}
		} while (!credentialsOK);
		System.out.println();
		System.out.println("Welcome to SKYNET...");
		scanner.close();
	}
	
	private String getTextFromInput(String label) {
		System.out.println(label + ": ");
		return scanner.nextLine();
	}
	
	private boolean verifyCredentials(String login, String password) {
		return this.login.equals(login) && this.password.equals(password);
	}
	 
	private void readCredentials() {
		File dataFile = new File("res/zadanie1/skynet.conf");
		String line = null;
		
		 try (Scanner scanner = new Scanner(dataFile)) {
			 String tempL = scanner.nextLine();
			 String tempP = scanner.nextLine();
			 login = tempL;
			 password = tempP;
			 System.out.println("INFO System reconfigured...");
			} catch (Exception x) {
				System.out.println("INFO No valid conf data");
			}
	}
	
	private void printSkyNetLogo() {
		// TODO print logo from file "res/zadanie1/logo.txt"
		File dataFile = new File("res/zadanie1/logo.txt");
		String line = null;
		
		 try (BufferedReader reader = Files.newBufferedReader(dataFile.toPath())) {
			 while ((line = reader.readLine()) != null) {
				 System.out.println(line);
			 }
			} catch (IOException x) {
			    System.err.format("IOException: %s", x);
			}
	}
}
