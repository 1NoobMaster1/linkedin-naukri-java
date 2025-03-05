package CoreJavaEight.FunctionalInterface;

@FunctionalInterface
interface FunctionalInterfaceExample {
    void sayMessage(String message); // Single Abstract/Unimplemented Method.
}

class FunctionalInterfaceUsage {
    public static void main(String[] args) {
        FunctionalInterfaceExample greet = (message) -> System.out.println("Hello, " +message);
        greet.sayMessage("Ayan Khan");
    }
}
