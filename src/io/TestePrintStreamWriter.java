package io;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestePrintStreamWriter {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		//PrintStream era utilizado nas versões mais antigas do java, quando não existia o PrintWriter
		// Writer é mais alto nível e menos burocrático.
//		PrintStream ps1 = new PrintStream("D:\\DEV\\workspaces\\ciee_web_2018\\ZA-Java\\src\\io\\writer.txt");
	    PrintWriter ps = new PrintWriter("D:\\DEV\\workspaces\\ciee_web_2018\\ZA-Java\\src\\io\\writer.txt");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("asfasdfsafdas dfs sdf asf assdß");
		
		ps.close();


	}

}
