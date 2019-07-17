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
    
}
