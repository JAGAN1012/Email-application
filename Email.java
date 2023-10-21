package emailapp;
import java.util.*;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private int passwordlength=8;
	private String department;
	private int mailboxcapacity=500;
	
	private String email;
	private String companyname="Saturo";
	public Email(String firstname, String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.department=Setdepartment();
		this.password=password(passwordlength);
		System.out.println("your password: "+this.password);
		email=firstname.toLowerCase()+lastname.toLowerCase()+"."+department.toLowerCase()+"."+companyname.toLowerCase()+"@"+"gmail.com";
		System.out.println("your email:"+ email);
		 }
	Scanner sc =new Scanner(System.in);

    private String Setdepartment() {
	System.out.println("Enter the department codes\n1 for sales\n2 for software\n3 for marketting\n4 for Accoutant\n0 for none");
	int departmentchoice=sc.nextInt(); 
	if(departmentchoice==1) {
		return "sales";
	}
	else if(departmentchoice==2) {
		return "software";
	}
	else if(departmentchoice==3) {
		return "marketing";
	}
	else if(departmentchoice==4) {
		return "Accounting";
	}
	else {
		return"";
	}
	 
}
    private String password(int length) {
    	String passwordset="ABCDEFGHIJKLMOPQRSTUVWXXZ!@#$%";
    	char []arr=new char[length];
    	for(int i=0;i<arr.length;i++) {
    		int rand=(int)(Math.random()*passwordset.length());
    		arr[i]=passwordset.charAt(rand);
    	}
    	String str= new String(arr);
    	return str;
    }
    public void setmailcapacity(int capacity) {
    	this.mailboxcapacity=capacity;
    }
    public int getmailcapacity(){
    	return mailboxcapacity;
    }
    public String show() {
    	return "DISPLAY NAME: "+ firstname+ " "+ lastname+ "\nCOMPANYEMAIL: "+ email+ "\nMAILCAPACITY:"+ mailboxcapacity+"mb";
    }
}
