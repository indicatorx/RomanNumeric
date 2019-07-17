/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Panudej Pamornsiritragul
 */
public class RomanNumeric {

    public String convert(int i) {
        if(i == 1) return "I";
        else if (i == 2) return "II";
        return "III";
    }
}
