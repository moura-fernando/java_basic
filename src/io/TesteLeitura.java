package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com um arquivo
		//FileInputStream fis = new FileInputStream("D:\\DEV\\workspaces\\ciee_web_2018\\ZA-Java\\src\\io\\reader.txt");
		FileInputStream fis = new FileInputStream("/Volumes/BKP/DEV/wrk_spring/ZA-Java/src/io/reader.txt");
		                                         
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		//FORMA MAIS GEN�RICA
//		InputStream io = new FileInputStream("D:\\DEV\\workspaces\\ciee_web_2018\\ZA-Java\\src\\io\\lorem.txt");
//		Reader reader = new InputStreamReader(io);
//		BufferedReader br2 = new BufferedReader(reader);
		
		String linha = br.readLine();
		
		System.out.println(linha);
		
		br.close();	
	}
}
