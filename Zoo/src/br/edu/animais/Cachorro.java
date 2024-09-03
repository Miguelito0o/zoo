package br.edu.animais;
import br.edu.interfaces.Pet;

public class Cachorro extends Canino implements Pet{
	
	public  void fazerBarulho() {
		System.out.println("AU AU");
	}
	
	public void brincar() {
	}
	
	public void serAmigavel() {
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
