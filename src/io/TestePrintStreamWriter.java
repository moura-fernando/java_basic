package io;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestePrintStreamWriter {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		//PrintStream era utilizado nas vers�es mais antigas do java, quando n�o existia o PrintWriter
		// Writer � mais alto n�vel e menos burocr�tico.
//		PrintStream ps1 = new PrintStream("D:\\DEV\\workspaces\\ciee_web_2018\\ZA-Java\\src\\io\\writer.txt");
	    PrintWriter ps = new PrintWriter("D:\\DEV\\workspaces\\ciee_web_2018\\ZA-Java\\src\\io\\writer.txt");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("asfasdfsafdas dfs sdf asf assd�");
		
		ps.close();


	}

}
