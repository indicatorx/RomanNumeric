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
        else if(i == 3) return "III";
        else if(i == 4) return "IV";
        else if(i == 5) return "V";
        else if(i == 6) return "VI";
        else if(i == 7) return "VII";
        else if(i == 8) return "VIII";
        else if(i == 9) return "IX";
        return "X";
    }
}
