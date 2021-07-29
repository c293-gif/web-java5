import java.util.Scanner;

public class User {
	
	private String userName;
	private String pass;
	private String email;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String pass, String email) {
		super();
		this.userName = userName;
		this.pass = pass;
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) throws Exception {
		if (userName ==null || userName.length()==0) 
			throw new Exception("K duoc bo trong");
			
		
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) throws Exception {
		if(pass.length()<7 ||pass.length()>15)
		throw new Exception("Pass phai dai tu 7 den 15 ki tu");
		
			
		
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		
		boolean check =true;
		do {
			System.out.println("Nhap tk");
			try {
				this.setUserName(sc.nextLine());
				check = true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				check = false;
				System.out.println(e.getMessage());
			}
			
		} while (!check);
		do {
			System.out.println("nhap mk:");
			try {
				this.setPass(sc.nextLine());
				check=true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				check=false;
				System.out.println(e.getMessage());
			}
		} while (!check);
		System.out.println("Nhap email:");
		this.setEmail(sc.nextLine());
		
	}

}
