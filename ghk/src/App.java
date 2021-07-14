import java.util.Scanner;

public class App  {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ListPlayer listPlayer = new ListPlayer();
       
        boolean check = true;
         listPlayer.getListPlayer();
         System.out.println("danh sách cầu thủ");
                    while (true) {
             System.out.println("***********Sắp sếp đội hình******************");
                    System.out.println("1 . Đội hình 4-3-3");
                    System.out.println("2 . Đội hình 4-4-2");
                    System.out.println("3 . Đội hình 3-5-2");
                    System.out.println("Vui lòng chọn");
                    int m = sc.nextInt();
                    switch (m) {
                        case 0:
                        check = false;
                            System.exit(0);
                            break;
                        case 1:
                            listPlayer.buildTeam(4, 3, 3);
                            break;
                        case 2:
                            listPlayer.buildTeam(4, 4, 2);
                            break;
                        case 3:
                            listPlayer.buildTeam(3, 5, 2);
                            break;
                        default:
                            System.out.println("không có lựa chọn này");
                            break;
                            

                    

                    }
            
        }
                   
                }
}

