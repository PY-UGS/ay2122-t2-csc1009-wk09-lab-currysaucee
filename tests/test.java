package tests;

import static org.junit.Assert.*;
import  org.junit.*;
import gen.*;

public class test {
    generate gen;

    @Before
    public void setup(){
        gen = new generate();
    }

    @Test
    public void testLower(){
        char temp = gen.getRandomLowerCaseLetter();
        assertTrue('a'<=temp && temp <= 'z');
    }

    @Test
    public void testUpper(){
        char temp = gen.getRandomUpperCaseLetter();
        System.out.println(temp);
        assertTrue('A'<=temp && temp <= 'Z');
    }
    @Test
    public void testDigit(){
        char temp = gen.getRandomDigitCharacter();
        assertTrue('0'<=temp && temp <= '9');
    }
    @Test
    public void testAll(){
        char temp = gen.getRandomUpperCaseLetter();
        assertTrue(('A'<=temp && temp <= 'Z')||
        ('a'<=temp && temp<='z')||
        ('0'<=temp && temp<='9')
        );
    }

    @Test
    public void testIsPrime1(){
        char temp = '9';
        assertFalse(gen.isprime(temp));
    }
    @Test
    public void testIsPrime2(){
        char temp = '2';
        assertTrue(gen.isprime(temp));
    }
}
