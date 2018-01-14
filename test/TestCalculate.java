/**
 *
 * Test realizados
 * *
 * 1-An empty string returns zero
 * 2-A single number returns the value
 * 3-Two numbers, comma delimited, returns the sum
 * 4-Two numbers, newline delimited, returns the sum
 * 5-Three numbers, delimited either way, returns the sum
 * 6-Negative numbers throw an exception
 * 7-Numbers greater than 1000 are ignored
 *
 */


import static org.testng.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Edilma Alvarado
 */

public class TestCalculate {

    private Calculator calculator ;

    @Before
    public void init(){
        calculator = new Calculator();
    }
    @Test
    public void empty_string_return_zero() throws Exception{

        assertEquals(calculator.calculate(""),0);
    }

    @Test
    public void single_value_is_replied() throws Exception{
        assertEquals(calculator.calculate("1"),1);
    }

    @Test
    public void two_numbers_comma_delimited_return_sum() throws Exception{
        assertEquals(calculator.calculate("1,2"), 3);
    }

    @Test
    public void two_numbers_new_delimited_return_sum() throws Exception{
        assertEquals(calculator.calculate("1\n2"), 3);
    }

    @Test
    public void three_Numbers_delimited_both_ways_return_sum() throws Exception{
        assertEquals(calculator.calculate("1,2,3"),6);
    }

    @Test(expected = Exception.class)
    public void negative_input_returns_exceptions() throws Exception{
        calculator.calculate("-1");
    }

    @Test
    public void ignore_numbers_greater_than_1000() throws Exception{
        assertEquals(calculator.calculate("10,10,1001"),20);

    }



}