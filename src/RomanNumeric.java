
import java.time.Clock;
import java.util.HashMap;
import java.util.Map;

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
    
    Map<Integer, String> map;
    int[] list = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

    public RomanNumeric() {
        map = new HashMap<Integer, String>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
    }

    public String convert(int i) {
        String roman = "";
        int left = i;
        for(int index = list.length - 1; index >= 0 ; index--){
            if(left >= list[index]) {
                int n = (int)(left/list[index]);
                System.out.println(index + ": n = " + n);

                for (int j = 0; j < n; j++) {
                    roman += map.get(list[index]);
                }
                left = left%list[index];
                System.out.println(index + ": left = " + left);
                System.out.println(index + ": roman = " + roman);
                //roman += list[index]
            }
            
        }
        System.out.println(i + ": " + roman);
        return roman;
    }
}
