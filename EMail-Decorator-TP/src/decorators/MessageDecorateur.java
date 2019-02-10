package decorators;

import appli.Message;

public abstract class MessageDecorateur extends Message {
	
	protected Message message;

	public MessageDecorateur(Message message) {
		super();
		this.message = message;
	}
	
	

}
