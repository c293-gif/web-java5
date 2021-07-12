public class App {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person();
        person1.name = "john";
        person1.age = 22;
        person1.address = "england";
        
        person1.study("math");

        Person person2 = new Person();
        person2.name = "lily";

        person2.study("english");
    }
}
