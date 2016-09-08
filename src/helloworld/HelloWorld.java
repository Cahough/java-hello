/*
 * Carter Hough
 * 08.25.16
 * CSCI 310 - Java
 * Hello World
 * Dr. MacEvoy
 * 
 * HelloWorld.java
 */

package helloworld;

import static kiss.API.*;

public class HelloWorld 
{
    void testRun()
    {
        try (Close out = outExpect("Hello World!")) {run(); }
//         outExpect("Hello!");
//         run();
//         outClose();
    }
    
    void run()
    {
        println("Hello World!");
    }
    
    void testBooleans()
    {
        assert true != false;
        assert true == true;
        assert false == false;
        try (Close out = outExpect("true"))  {println(true); }
        try (Close out = outExpect("false"))  {println(false); }
        
        // not
        assert !true == false;
        assert !false == true;
        
        // and
        assert (true && true) == true;
        assert (true && false) == false;
        assert (false && true) == false;
        assert (false && false) == false;
        
        assert (false && (random(0,1) == 1)) == false;
        
        assert (false && (1/0 == 3)) == false;
        
        // or
        assert (true || true) == true;
        assert (true || false) == true;
        assert (false || true) == true;
        assert (false || false) == false;
        
        assert (true || (random(0,1) == 1)) == true;
        
        assert (true || (1/0 == 3)) == true;
    }
}
