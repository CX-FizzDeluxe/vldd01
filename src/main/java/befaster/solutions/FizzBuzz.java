package befaster.solutions;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        boolean multiply3 = number % 3 == 0 || String.valueOf(number).contains("3");
        boolean multiply5 = number % 5 == 0 || String.valueOf(number).contains("5");
        Set<Character> set = new HashSet<>();
        for (char c : String.valueOf(number).toCharArray()) {
            set.add(c);
        }
        boolean isSameCharater = set.size() == 1 && number > 10;

        String result = isSameCharater ? " deluxe" : "";

        if (multiply3 && multiply5) {
            return "fizz buzz".concat(result);
        } else if (multiply3) {
            return "fizz".concat(result);
        } else if (multiply5) {
            return "buzz".concat(result);
        } else if (isSameCharater) {
            return result;
        } else {
            return String.valueOf(number);
        }
    }
}