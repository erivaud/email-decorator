package appli;

import decorators.EmailPoliDecorator;
import decorators.SignatureDecorator;

public class App {

	public static void main(String[] args) {
		Message m;
		
		m = new Email();
		System.out.println(m.getTexte());
		System.out.println("---------------------------------------------");
		
		
		m = new SignatureDecorator(new Email());
		System.out.println(m.envoyer());
		System.out.println("---------------------------------------------");
		
		m = new EmailPoliDecorator(new Email());
		System.out.println(m.envoyer());
		System.out.println("---------------------------------------------");
		
		m = new EmailPoliDecorator(new SignatureDecorator(new Email()));
		System.out.println(m.envoyer());
		System.out.println("---------------------------------------------");
		
		
		
	}

}
