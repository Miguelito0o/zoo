package br.edu.animais;
import br.edu.interfaces.*;

public class Gato extends Felino implements Pet{
	
	public void brincar() {
		System.out.println("miau");
	}
	
	public void serAmigavel() {
	}
	
	public void fazerBarulho() {
		System.out.println("Miau");
	}
	public void comer(){
		System.out.println("nham nham");
	}
	
	public void dormir() {
		System.out.println("zzz");
	}
	
	public void movimentar() {
		System.out.println("*andando*");
	}

}
