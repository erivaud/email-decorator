package appli;

public class Email extends Message {
	public Email() {
		texte = "Contenu de mon email";
	}

	@Override
	public String envoyer() {
		return texte;
	}

}
