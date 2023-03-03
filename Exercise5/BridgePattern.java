package Assignment5;

public abstract class BridgePattern {

	public static void main(String[] args)  {
		
		Message media=new Media(new Email());
		media.sendMessage();
	}
}

abstract class Message{
	MessageSender sender;
	abstract void sendMessage();
}

class Textmessage extends Message{
	public Textmessage(MessageSender sender) {
		
		this.sender=sender;
	}
	@Override
	void sendMessage() {
		
		System.out.println("text message");
		sender.send();
	}
	
}

class Media extends Message{
	public Media(MessageSender sender) {
		
		this.sender=sender;
	}
	@Override
	void sendMessage() {
		
		System.out.println("media message");
		sender.send();
	}
	
}

interface MessageSender{
	void send();
}

class Email implements MessageSender{

	@Override
	public void send() {
		
		System.out.println("sent via email");
	}
	
}

class SMS implements MessageSender{

	@Override
	public void send() {
		
		System.out.println("sent via SMS");
	}
	
}
