import java.util.Scanner;

public class Animal {
    String name;
    String color;
    int leg;
    
    

   



    public Animal(String name, String color, int leg) {
        this.name = name;
        this.color = color;
        this.leg = leg;
    }




    @Override
    public String toString() {
        return "tên động vật:" + name + ", màu lông của " + name+ " :" + color + ", số chân của " + name+ " :" + leg;
    }


    

    public Animal() {
    }




    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên động vật: ");
        name = sc.nextLine();

        System.out.println("màu lông của " + name + " :");
        color = sc.nextLine();

        System.out.println("số chân của " + name + " :");
        leg = Integer.valueOf(sc.nextLine());
    }

    
}
