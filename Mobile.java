package day1;
public class Mobile {
	
	public void makeCall () {
		System.out.println ("Make call");
		}
	public void sendMsg () {
		System.out.println ("send txt");
	}
	public static void main(String[] args) {
		//System.out.println ("main");
		Mobile myMobile = new Mobile ();
		myMobile.makeCall();
		myMobile.sendMsg();
	}
}