package SingletoneDesignPattern;

public class ApplicationConfiguration {
    private ApplicationConfiguration() {}
    private static ApplicationConfiguration obj = null;
    public static ApplicationConfiguration getInstance() {
        if(obj == null) {
            obj = new ApplicationConfiguration();
        }
        return obj;
    }
}

class Main {
    public static void main(String[] args) {
        ApplicationConfiguration obj1 = ApplicationConfiguration.getInstance();
        ApplicationConfiguration obj2 = ApplicationConfiguration.getInstance();
        ApplicationConfiguration obj3 = ApplicationConfiguration.getInstance();
    }
}
