public class Pitago {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println("chiều dài hai cạnh gọc vuông là: " + a + " và " + b);


        
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("áp dụng định lý pitago ta có cạnh Huyền là: " + c);
    }
}