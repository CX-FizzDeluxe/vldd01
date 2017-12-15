package befaster.solutions;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        boolean multiply3 = number % 3 == 0 || String.valueOf(number).contains("3");
        boolean multiply5 = number % 5 == 0 || String.valueOf(number).contains("5");

        String deluxeResult = (multiply3 || multiply5) ? number % 2 == 1 ? " fake deluxe" : " deluxe" : "";

        if (multiply3 && multiply5) {
            return "fizz".concat(deluxeResult).concat(" buzz").concat(deluxeResult);
        } else if (multiply3) {
            return "fizz".concat(deluxeResult);
        } else if (multiply5) {
            return "buzz".concat(deluxeResult);
        } else {
            return String.valueOf(number);
        }
    }
}