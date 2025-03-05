package OOPS;

public class SingleInheritance {
    float salary = 10000.0f;
}

class Programmer extends SingleInheritance {
    int bonus = 1000;
    public static void main(String[] args) {
        int bonus = 1000;
        Programmer p = new Programmer();
        System.out.println(p.bonus);
        System.out.println(p.salary);
    }
}
