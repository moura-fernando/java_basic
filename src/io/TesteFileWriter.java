package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriter {

	public static void main(String[] args) throws IOException {

	    String separator = System.lineSeparator();
        //FileWriter fw = new FileWriter("D:\\DEV\\workspaces\\ciee_web_2018\\ZA-Java\\src\\io\\writer.txt");
	    FileWriter fw = new FileWriter("/Volumes/BKP/DEV/wrk_spring/ZA-Java/src/io/writer.txt");
	    fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        fw.write(separator);
        fw.write(separator);
        fw.write("asfasdfsafdas dfs sdf asf assd�");

        fw.close();
        
        
        //Entretando a Classe BufferedWritter � mais alto n�vel, ent�o vale encapsular a File Writer
        
       // BufferedWriter bw = new BufferedWriter( new FileWriter("D:\\DEV\\workspaces\\ciee_web_2018\\ZA-Java\\src\\io\\writer.txt"));
        BufferedWriter bw = new BufferedWriter( new FileWriter("/Volumes/BKP/DEV/wrk_spring/ZA-Java/src/io/writer.txt"));
        bw.write("Teste2");
        bw.newLine();
        bw.newLine();
        bw.write("asfasdfsafdas dfs sdf asf assd�");

        bw.close();
	}

}
