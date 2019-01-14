package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteLeituraEscrita {

	public static void main(String[] args) throws IOException  {
		
		
		//Reader
		InputStream in = new FileInputStream("/Volumes/BKP/DEV/wrk_spring/ZA-Java/src/io/reader.txt");
		Reader is = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(is);
		
		//Writer
		OutputStream out = new FileOutputStream("D:\\DEV\\workspaces\\ciee_web_2018\\ZA-Java\\src\\io\\writer.txt");
		Writer ow = new OutputStreamWriter(out);
		BufferedWriter writer = new BufferedWriter(ow);
		

		String linha = reader.readLine();
		
		while (linha != null ) {
			writer.write(linha);
			writer.newLine();
			linha = reader.readLine();
		}
		
		
		reader.close();
		writer.close();
		

	}

}
