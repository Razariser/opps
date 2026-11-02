import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class UserDefinedExceptions {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Age " + age + " is not valid for voting (must be 18 or above)");
        System.out.println("Age " + age + " is eligible to vote");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Program finished");
        }
    }
}
