package test.Problem7;

import main.Problem7.TLSer;
import org.junit.Test;

import static org.junit.Assert.*;
//import static org.hamcrest.Matchers.is;

/**
 * Created by ahacker on 12/18/2016.
 */
public class TLSerTest {

    @Test
    public void testSupportsTLS(){
        String valid = "abba";
        assert TLSer.supportsABBA(valid);
    }

}