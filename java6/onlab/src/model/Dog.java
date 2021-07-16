package model;
public class Dog {
    String breed, size, color;
    int age;


   




    public void name(String breedName) {
        System.out.println(breed + " name " + breedName);
    }


    public void eat(String food) {
        System.out.println(breed + " eat " + food);
    }

    public void run(int speed) {
        System.out.println(breed + " run " + speed + "km/h");
    }
    
    
    

     @Override
    public String toString() {
        return "Dog [age=" + age + " years" + ", breed=" + breed + ", color=" + color + ", size=" + size + "]";
    }
    
}
