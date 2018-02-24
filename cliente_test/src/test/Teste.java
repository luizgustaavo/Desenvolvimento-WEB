package test;

import entity.Cliente;

public class Teste {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNome("Luiz Gustavo");
		cliente.setFormando(false);
		cliente.setAltura(1.82);
		cliente.setCompras(null);
		
		System.out.println(cliente);

	}

}
