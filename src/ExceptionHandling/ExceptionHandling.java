package ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int i = 1/0;
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally Block!");
        }
        System.out.println("Correct this Code... .");
    }
}
