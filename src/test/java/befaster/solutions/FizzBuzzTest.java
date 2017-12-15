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
        String result = FizzBuzz.fizzBuzz(11);
        Assert.assertEquals("deluxe", result);
    }
}