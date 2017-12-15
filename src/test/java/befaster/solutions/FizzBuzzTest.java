package befaster.solutions;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rafal on 15/12/2017.
 */
public class FizzBuzzTest {
/*
     - {"method":"fizz_buzz","params":[27],"id":"FIZ_R5_006"}, expected: "fizz", got: "fizz fake deluxe"
            - {"method":"fizz_buzz","params":[129],"id":"FIZ_R5_007"}, expected: "fizz", got: "fizz fake deluxe"
            - {"method":"fizz_buzz","params":[201],"id":"FIZ_R5_008"}, expected: "fizz", got: "fizz fake deluxe"
    */
    @Test
    public void fizzBuzzTest() {
        String result = FizzBuzz.fizzBuzz(27);
        Assert.assertEquals("fizz", result);

        result = FizzBuzz.fizzBuzz(129);
        Assert.assertEquals("fizz", result);

        result = FizzBuzz.fizzBuzz(201);
        Assert.assertEquals("fizz", result);

    }
}