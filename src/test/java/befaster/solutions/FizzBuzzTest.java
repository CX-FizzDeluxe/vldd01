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

                 - {"method":"fizz_buzz","params":[13],"id":"FIZ_R5_010"}, expected: "fizz", got: "13"
     - {"method":"fizz_buzz","params":[43],"id":"FIZ_R5_011"}, expected: "fizz", got: "43"
     - {"method":"fizz_buzz","params":[163],"id":"FIZ_R5_012"}, expected: "fizz", got: "163"


      - {"method":"fizz_buzz","params":[30],"id":"FIZ_R5_038"}, expected: "fizz buzz deluxe", got: "fizz deluxe buzz deluxe"
 - {"method":"fizz_buzz","params":[3510],"id":"FIZ_R5_039"}, expected: "fizz buzz deluxe", got: "fizz deluxe buzz deluxe"
 - {"method":"fizz_buzz","params":[15],"id":"FIZ_R5_040"}, expected: "fizz buzz fake deluxe", got: "fizz fake deluxe buzz fake deluxe"
        */
    @Test
    public void fizzBuzzTest() {
        String result = FizzBuzz.fizzBuzz(27);
        Assert.assertEquals("fizz", result);

        result = FizzBuzz.fizzBuzz(129);
        Assert.assertEquals("fizz", result);

        result = FizzBuzz.fizzBuzz(201);
        Assert.assertEquals("fizz", result);

        result = FizzBuzz.fizzBuzz(13);
        Assert.assertEquals("fizz", result);

        result = FizzBuzz.fizzBuzz(43);
        Assert.assertEquals("fizz", result);

        result = FizzBuzz.fizzBuzz(163);
        Assert.assertEquals("fizz", result);


        result = FizzBuzz.fizzBuzz(30);
        Assert.assertEquals("fizz buzz deluxe", result);


        result = FizzBuzz.fizzBuzz(3510);
        Assert.assertEquals("fizz buzz deluxe", result);


        result = FizzBuzz.fizzBuzz(15);
        Assert.assertEquals("fizz buzz fake deluxe", result);


    }
}