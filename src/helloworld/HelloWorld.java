/*
Carter Hough
08.25.16
CSCI 310 - Java
Hello World
Dr. MacEvoy
 
HelloWorld.java
*/

package helloworld;

import static kiss.API.*;

public class HelloWorld 
{
    void testRun()
    {
        try (Close out = outExpect("Hello World!")) {run(); }
         outExpect("Hello!");
         run();
         outClose();
    }
    
    void run()
    {
        println("Hello World!");
    }
}