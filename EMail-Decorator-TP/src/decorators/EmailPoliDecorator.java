package decorators;

import appli.Message;

public class EmailPoliDecorator extends MessageDecorateur {

	public EmailPoliDecorator(Message message) {
		super(message);
	}

	@Override
	public String envoyer() {
		return "Bonjour Madame, Monsieur, " + message.envoyer() ;
	}
	

}
