public class Ex1 {
    public static void main(String[] args) {
        String str = "Hello every one";

        int count = 0;
        System.out.println("index của kí tự e là :");

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'e') {
                count++;
                
                System.out.println(i);
                

            }
        }
        System.out.println("có " + count + " kí tự e");
        
    }

}
