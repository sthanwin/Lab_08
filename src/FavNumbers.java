import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;

        favInt = SafeInput.getInt(in, "Enter your favorite integer");
        favDouble = SafeInput.getDouble(in, "Enter your favorite decimal");

        System.out.println("\nYour favorite integer is: " + favInt);
        System.out.println("\nYour favorite decimal is: " + favDouble);

    }
}
