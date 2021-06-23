public class App {
    public static void main(String[] args) throws Exception {
        String name = "Trịnh Anh Cương";
        String address = "Thanh Hóa";
        Agemul age = new Agemul();

        System.out.println("Tôi tên là " + name);
        System.out.println("Địa chỉ " + address);
        System.out.println(age.mul() + " tuổi");
    }
}
