public class Student {
    private String name, address;
    private int age;

    



    public String getName() {
        return name;
    }





    public void setName(String name) {
        this.name = name;
    }





    public String getAddress() {
        return address;
    }





    public void setAddress(String address) {
        this.address = address;
    }





    public int getAge() {
        return age;
    }





    public void setAge(int age) {
        this.age = age;
    }





    public Student(String name, int age, String address) {
        this.name = name;
        this.address = address;
        this.age = age;
    }





    @Override
    public String toString() {
        return name + "-"+ age + "-" + address;
    }


    
    
}