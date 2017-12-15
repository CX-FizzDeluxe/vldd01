package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        boolean multiply3 = number % 3 == 0 || String.valueOf(number).contains("3");
        boolean multiply5 = number % 5 == 0 || String.valueOf(number).contains("5");

        if (multiply3 && multiply5) {
            return "fizz buzz";
        } else if (multiply3) {
            return "fizz";
        } else if (multiply5) {
            return "buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
