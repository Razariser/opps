class AgeException extends Exception {
    AgeException(String m) { super(m); }
}
public class UserDefinedExceptions {
    static void check(int age) throws AgeException {
        if (age < 18) throw new AgeException("Age below 18");
        System.out.println("Eligible");
    }
    public static void main(String[] args) {
        try {
            check(15);
        } catch (AgeException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
