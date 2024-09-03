package br.edu.animais;

public abstract class Animal {
	
	protected String foto;
	protected String comida;
	protected String fome;
	protected String boundaries;
	protected String location;
	protected String cor;
	protected String numPatas;
	
	public abstract void fazerBarulho();

	public abstract void comer();
	
	public abstract void dormir(); 
	
	public abstract void movimentar();
}
