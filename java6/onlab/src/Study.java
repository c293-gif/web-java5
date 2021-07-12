public class Study {
    int id;
    String name;
    double theoryPoint;
    double practicePoint;




    public Study(int id, String name, double theoryPoint, double practicePoint) {
        this.id = id;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }


     public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id: ");
        id = Integer.valueOf(sc.nextLine());
        System.out.println("nhập tên: ");
        name = sc.nextLine();
        System.out.println("nhập tuổi: ");
        theoryPoint = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        address =sc.nextLine();
    }
    
}
