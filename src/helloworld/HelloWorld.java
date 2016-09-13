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
    
    int side;
    void sideEffects(int y)
    {
        println(y);
    }
    
    void testInts()
    {
        assert Integer.MAX_VALUE == Math.pow(2, 31)-1;
        assert Integer.MAX_VALUE == 2_147_483_647;
        assert Integer.MAX_VALUE == 0b0111_1111_1111_1111_1111_1111_1111_1111;
        
        assert Integer.MIN_VALUE == -Math.pow(2, 31);
        assert Integer.MIN_VALUE == -2_147_483_648;
        assert Integer.MIN_VALUE == 0b1000_0000_0000_0000_0000_0000_0000_0000;
        
        assert Integer.MIN_VALUE -1 == Integer.MAX_VALUE;
        assert Integer.MAX_VALUE + 1 == Integer.MIN_VALUE;
        
        int x = 3_000;
        int y = 0xff_ff;
        int z = 0b10_01;
        
        assert x == 3000;
        assert y == 65535;
        assert z == 9;
        
        assert 17/5 == 3;
        assert ((double) 17)/((double) 5) == 3.4;
        
        int a = 1;
        ++a;
        
        try (Close out = outExpect("2")) {println(a); }
        try (Close out = outExpect("3")) {println(++a); }
        try (Close out = outExpect("3")) {println(a); }
        
        try (Close out = outExpect("3")) {println(a++); }
        try (Close out = outExpect("4")) {println(a); }
        
        // bitwise not
        assert ~0b0000_0000_0000_0000_0000_0000_1111_0000 
             == 0b1111_1111_1111_1111_1111_1111_0000_1111;
        
        // bitwise and
        assert (0b1111_0000 
              & 0b1010_1010) 
             == 0b1010_0000;
        
        // bitwise or
        assert (0b1111_0000 
              | 0b1010_1010)
             == 0b1111_1010;
        
        // bit-shift operator
        assert (0b1010_1111_0000 >> 4) == 0b1010_1111;
        
        int b = random(0, 1_000_000);
        assert ((b >> 1) == b/2);
        
        int c = random(-1_000_000, 1_000_000);
        assert (((~c)+1) == -c);
        
        assert -2 == 0b1111_1111_1111_1111_1111_1111_1111_1110;
        
        // right shifts shift the sign bit in (highest order bit).
        assert (-2 >> 1) == 0b1111_1111_1111_1111_1111_1111_1111_1111;
    }
    
    void testConvert()
    {
        byte x = -1;
        //assert x == 0b1111_1111_1111_1111_1111_1111_1111_1111;
        assert x == (byte) 0b1111_1111;
        int y = x;
        assert y == -1;
        assert 0b1111_1111_1111_1111_1111_1111_1111_1111 == (int) (byte) 0b1111_1111;
    }
    
    void testLoop()
    {
        
    }
}
