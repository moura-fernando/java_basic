package util.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TesteScannerParser {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("D:\\DEV\\workspaces\\ciee_web_2018\\ZA-Java\\src\\util\\scanner\\contas.txt"));
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(",");
			
			
			
			while (linhaScanner.hasNext()) {
				String palavra = linhaScanner.next(); 
				System.out.println(palavra);
			}
			
			linhaScanner.close();
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
		}
		
		scanner.close();
	}
	
	

}
