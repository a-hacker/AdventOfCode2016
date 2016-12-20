package test.Problem5;

import main.problem5.Hasher;
import org.junit.Test;

/**
 * Created by ahacker on 12/17/2016.
 */
public class TestHasher {

    private final Hasher testHasher = new Hasher("abc");

    @Test
    public void testNextHash(){
        testHasher.counter = 3231929;
        assert testHasher.nextHash().startsWith("000001");
    }

    @Test
    public void testTestHash(){
        // according to advent of code, this should be valid
        String testHash = "00000155F8105DFF7F56EE10FA9B9ABD";

        assert testHasher.testHash(testHash);
    }
}
