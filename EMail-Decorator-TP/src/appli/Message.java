package appli;

public abstract class Message {

	protected String texte;
	
	public abstract String envoyer();

	public String getTexte() {
		return texte;
	}
	
}
