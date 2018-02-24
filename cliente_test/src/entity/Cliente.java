package entity;

import java.util.ArrayList;

public class Cliente {
	private int id;
	private String nome;
	private double altura;
	private boolean formando;
	private ArrayList<Compra> compras;
	
	
	public Cliente(int id, String nome, double altura, boolean formando, ArrayList<Compra> compras) {
		super();
		this.id = id;
		this.nome = nome;
		this.altura = altura;
		this.formando = formando;
		this.compras = compras;
	}
	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public boolean isFormando() {
		return formando;
	}
	public void setFormando(boolean formando) {
		this.formando = formando;
	}
	public ArrayList<Compra> getCompras() {
		return compras;
	}
	public void setCompras(ArrayList<Compra> compras) {
		this.compras = compras;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", altura=" + altura + ", formando=" + formando + ", compras="
				+ compras + "]";
	}
	

}
