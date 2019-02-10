package decorators;

import appli.Message;

public class SignatureDecorator extends MessageDecorateur {

	public SignatureDecorator(Message message) {
		super(message);
	}

	@Override
	public String envoyer() {
		return message.envoyer() + ", Signature de mail";
	}

}
