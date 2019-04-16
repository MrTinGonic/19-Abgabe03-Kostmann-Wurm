package at.fhj.iit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringStackTest
{
    public Stack s;
    
    @Before
    public void setup() throws Exception
    {
        s = new StringStack(5); // keep size of 5 !!
    }
    
    /**
     * tests if stack is empty after initialization
     * 
     * use assert
     * - assertTrue to check it's empty
     */
    @Test
    public void testIsEmpty() throws Exception
    {
        Assert.assertTrue(s.isEmpty());
    }
    
    /**
     * tests if stack is empty after pushing
     * 
     * use assert
     * - assertFalse to check it's not empty
     */
    @Test
    public void testIsNotEmpty() throws Exception
    {
        s.push("123");
        Assert.assertFalse(s.isEmpty());
    }

    /**
     * tests push and pop function
     * 
     * do following test
     * - use push, 1 or x times
     * - use pull, as often as you use push
     * - use isEmpty to check that's empty again
     * - assert every content of the stack in the correct ordering
     * @throws Exception 
     */
    @Test
    public void testPushPop() throws Exception
    {
        //Add some random elements to the stack
        s.push("Oans");
        s.push("Zwoa");
        s.push("Dree");
        s.push("Foa");

        //Compare elements with expected elements and pop
        Assert.assertEquals("Foa",s.pop());
        Assert.assertEquals("Dree",s.pop());
        Assert.assertEquals("Zwoa",s.pop());
        Assert.assertEquals("Oans",s.pop());

        //Check if the stack is empty
        Assert.assertTrue(s.isEmpty());
        
    }

    /**
     * tests pushing too much elements on stack.
     * Excepted exception is caught (capacity != pushed elements)
     *
     * @throws Exception
     */

    @Test(expected=Exception.class)
    public void pushOverflow() throws Exception {
        s.push("1");
        s.push("2");
        s.push("3");
        s.push("4");
        s.push("5");
        s.push("6");
        
    }

    @Test
    public void FloTest() {
    }

    /**
     * Feel Free to insert other test cases for the String Stack Implementation !!!
     */
    
}
