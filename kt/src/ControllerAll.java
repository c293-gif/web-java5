import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ControllerAll {
	
	
	Scanner sc  = new Scanner(System.in);
	
	List<User> listUser = new ArrayList<User>();
	public void Insert() {
		User user = new  User();
	user.inputData();
	listUser.add(user);
	System.out.println("Dang ki thanh cong");
	
		
		
	}
public void Login() {
	System.out.println("Nhap tk:");
	String tk = sc.nextLine();
	for (User user : listUser) {
		if (user.getUserName().equals(tk)) {
			System.out.println("nhap mk:");
			String mk = sc.nextLine();
			if (user.getPass().equals(mk)) {
				boolean check =true;
				while (check) {
					System.out.println("Chào mừng  :"+ user.getUserName());
					System.out.println("1.Thay đổi username");
					System.out.println("2.thay đổi email");
					System.out.println("3.thay đổi mk");
					System.out.println("4. đăng xuất");
					int n = Integer.parseInt(sc.nextLine());
					switch (n) {
					case 1:
						System.out.println("nhap userName mới:");
						String useName = sc.nextLine();
						try {
							user.setUserName(useName);
							System.out.println("Đổi userName thành công");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						break;
					case 2:	
						System.out.println("nhap password mới:");
						String pass = sc.nextLine();
						try {
							user.setPass(pass);
							System.out.println("Đổi Pass thành công");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					case 3:	
						System.out.println("nhap email mới:");
						String email = sc.nextLine();
						try {
							user.setEmail(email);
							System.out.println("Đổi Pass thành công");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					case 4:						
						check = false;
						break;

					default:
						System.out.println("vui long lua chon lai");
						break;
					}
				}
				
			}else {
				System.out.println(" 1 .Đăng nhập lại");
				
				System.out.println(" 2 .Quên mật khẩu");
				int m = Integer.parseInt(sc.nextLine());
				switch (m) {
				case 1:	
					Login();
					break;
				case 2:	
					System.out.println("Nhap email");
					String emailAll = sc.nextLine();
					if (user.getEmail().equals(emailAll)) {
						System.out.println("nhap mat khau moi :");
						String pas = sc.nextLine();
						try {
							user.setPass(pas);
							Login();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}else {
						System.out.println("tk chua ton tai");
					}
					break;

				default:
					break;
				}
			}
			
			
		}else {
			System.out.println("sai tk vui long kiem tra lai");
		}
		
	}
}
}
