
import java.util.LinkedHashMap;
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
//    int[] list = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

    public RomanNumeric() {
        map = new LinkedHashMap<Integer, String>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public String convert(int i) {
        String roman = "";
        int left = i;
        int n = 0;

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            if(left >= entry.getKey()) {
                n = left/entry.getKey();
                for (int j = 0; j < n; j++) {
                    roman += entry.getValue();
                }
                left = left % entry.getKey();
            }
        }
        System.out.println(i + ": " + roman);
        return roman;
    }
}
