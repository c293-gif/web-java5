import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ControllerAll con = new ControllerAll();
		while (true) {
			System.out.println("**********Menu****************");
			System.out.println("1 . Đăng nhập");
			System.out.println("2 . Đăng kí");
			int n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:
				con.Login();
				break;
			case 2:
				con.Insert();

				break;
				

			default:
				break;
			}

		}

	}

}
