package co.interleap.courses.tdd;

import static org.junit.Assert.*;
import org.junit.Test;

public class VowelCounterTest {

    @Test
    public void testEmptyString(){
     VowelCounter aVowelCounter = new VowelCounter();
     assertEquals(0, aVowelCounter.count(""));
    }

    @Test
    public void testSingleVowelNoConsonants(){
        VowelCounter aVowelCounter = new VowelCounter();
        assertEquals(1, aVowelCounter.count("e"));
    }

    @Test
    public void testMultipleVowelsNoConsonants(){
        VowelCounter aVowelCounter = new VowelCounter();
        assertEquals(9, aVowelCounter.count("aaeiiioou"));
    }

    @Test
    public void testMultipleVowelsAndConsonants(){
        VowelCounter aVowelCounter = new VowelCounter();
        assertEquals(3, aVowelCounter.count("hello world"));
    }

    @Test
    public void testStringWithUppercaseAndLowercaseChar(){
        VowelCounter aVowelCounter = new VowelCounter();
        assertEquals(14, aVowelCounter.count("Almost before we KNew it, we had lEft the groUND"));
    }
}
