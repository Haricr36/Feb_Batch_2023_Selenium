package Week2.day1;

public class Mobile {
	public void sendMessage() {
		System.out.println("You Can Give a text in Message");
	}
	public void shareDocument() {
		System.out.println("Share Files From Anywhere on Shareit");
	}
	public void call() {
		System.out.println("Keep in Touch with a call");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Mobile myMobile = new Mobile();
		myMobile.sendMessage();
		myMobile.shareDocument();
		myMobile.call();
		
			
		}
	}


