package util.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("D:\\DEV\\workspaces\\ciee_web_2018\\ZA-Java\\src\\util\\scanner\\contas.txt"));
		
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		
		scanner.close();
	}

}
