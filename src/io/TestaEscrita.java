package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestaEscrita {

	public static void main(String[] args) throws IOException {
		
		//OutputStream out = new FileOutputStream("D:\\DEV\\workspaces\\ciee_web_2018\\ZA-Java\\src\\io\\writer.txt");
		OutputStream out = new FileOutputStream("/Volumes/BKP/DEV/wrk_spring/ZA-Java/src/io/writer.txt");
		Writer osw = new OutputStreamWriter(out);
		BufferedWriter writer = new BufferedWriter(osw);
		
		writer.write("Linha blablablabla44");
		writer.newLine();
		writer.newLine();
		writer.write("Final Line bla bla bla2");
		
		
		writer.close();
	}

}
