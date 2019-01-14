package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import modelo.banco.Cliente;

public class TesteSerializacaoCliente {
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Fernando");
		cliente.setProfissao("Dev");
		cliente.setCpf("9289328983");
		
		
		
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\DEV\\workspaces\\ciee_web_2018\\ZA-Java\\src\\io\\cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();

    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\DEV\\workspaces\\ciee_web_2018\\ZA-Java\\src\\io\\cliente.bin"));
    Cliente cliente2 = (Cliente) ois.readObject();
    ois.close();
    System.out.println(cliente2.getNome());
		
	}

}
