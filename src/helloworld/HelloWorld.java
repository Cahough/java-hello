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
        outExpect("Hello!");
        run();
        outClose();
    }
    
    void testAdd()
    {
        assert 1+1 == 2;
    }
    
    void run()
    {
        println("Hello!");
    }
}
