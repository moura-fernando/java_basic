package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
//          String nome = "Fernando";
//
//          ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\DEV\\workspaces\\ciee_web_2018\\ZA-Java\\src\\io\\objeto.bin"));
//      	  oos.writeObject(nome);
//          oos.close();

          ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\DEV\\workspaces\\ciee_web_2018\\ZA-Java\\src\\io\\objeto.bin"));
          String nome = (String) ois.readObject();
          ois.close();
          System.out.println(nome);
		
	}

}
