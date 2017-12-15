package befaster.solutions;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rafal on 15/12/2017.
 */
public class FizzBuzzTest {

    @Test
    public void fizzBuzzTest() {
        String result = FizzBuzz.fizzBuzz(15);
        Assert.assertEquals("fizz fake deluxe buzz fake deluxe", result);

        result = FizzBuzz.fizzBuzz(30);
        Assert.assertEquals("fizz deluxe buzz deluxe", result);

        result = FizzBuzz.fizzBuzz(35);
        Assert.assertEquals("fizz deluxe", result);

        result = FizzBuzz.fizzBuzz(3);
        Assert.assertEquals("fizz fake deluxe", result);
    }
}