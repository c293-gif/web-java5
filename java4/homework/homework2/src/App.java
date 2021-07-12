import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượn động vật cần quản lí: ");
        int n = scanner.nextInt();



        Animal[] arraypAnimals = new Animal[n];

        for (int i = 0; i < arraypAnimals.length; i++) {
            Animal animal = new Animal();
            animal.input();
            arraypAnimals[i] = animal;
        }

        System.out.println("danh sách động vật");
        for (int i = 0; i < arraypAnimals.length; i++) {
            System.out.println(arraypAnimals[i]);
        }

    
    }
}
