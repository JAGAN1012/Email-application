package emailapp;

public class EmailApp {
	public static void main(String []args) {
		Email em1=new Email("Eren","J");
		Email em2=new Email("Mikasha","E");
		System.out.println(em1.show());
		System.out.println(em2.show());
	}

}
