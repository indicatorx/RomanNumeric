/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Panudej Pamornsiritragul
 */
public class RomanNumericTest {
    
    RomanNumeric count;
    public RomanNumericTest() {
        count = new RomanNumeric();
    }
    
    @Test
    public void ReturnIWhenItIs1(){
        String actual = count.convert(1);
        assertEquals("I", actual);
    }
    
    @Test
    public void ReturnIIWhenItIs2(){
        String actual = count.convert(2);
        assertEquals("II", actual);
    }
    
    @Test
    public void ReturnIIIWhenItIs3(){
        String actual = count.convert(3);
        assertEquals("III", actual);
    }
    
    @Test
    public void ReturnIVWhenItIs4(){
        String actual = count.convert(4);
        assertEquals("IV", actual);
    }
    
    @Test
    public void ReturnVWhenItIs5(){
        String actual = count.convert(5);
        assertEquals("V", actual);
    }
    
    @Test
    public void ReturnVIWhenItIs6(){
        String actual = count.convert(6);
        assertEquals("VI", actual);
    }
    
    @Test
    public void ReturnVIIWhenItIs7(){
        String actual = count.convert(7);
        assertEquals("VII", actual);
    }
    
    @Test
    public void ReturnVIIIWhenItIs8(){
        String actual = count.convert(8);
        assertEquals("VIII", actual);
    }
    
    @Test
    public void ReturnIXWhenItIs9(){
        String actual = count.convert(9);
        assertEquals("IX", actual);
    }
    
    @Test
    public void ReturnXWhenItIs10(){
        String actual = count.convert(10);
        assertEquals("X", actual);
    }
    
    @Test
    public void ReturnXIWhenItIs11(){
        String actual = count.convert(11);
        assertEquals("XI", actual);
    }

    @Test
    public void ReturnLXVWhenItIs65(){
        String actual = count.convert(65);
        assertEquals("LXV", actual);
    }

    @Test
    public void ReturnLXIXWhenItIs69(){
        String actual = count.convert(69);
        assertEquals("LXIX", actual);
    }

    @Test
    public void ReturnMCMXLWhenItIs1940(){
        String actual = count.convert(1940);
        assertEquals("MCMXL", actual);
    }
    
}
