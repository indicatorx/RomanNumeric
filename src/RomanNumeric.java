
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
    int[] list = {1, 5, 10, 50, 100, 500, 1000};

    public RomanNumeric() {
        map = new HashMap<Integer, String>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        
    }
    
    
    public String convert(int i) {
        String roman = "";
        int left = i;
        for(int index = list.length - 1; index >= 0 ; index--){
            if(left >= list[index]) {
                int n = (int)(left/list[index]);
                System.out.println(index + ": n = " + n);

                if(left == 4 || left == 9) {

                }
                else {
                    for (int j = 0; j < n; j++) {
                        roman += map.get(list[index]);
                    }
                }
                left = left%list[index];
                System.out.println(index + ": left = " + left);
                System.out.println(index + ": roman = " + roman);
                //roman += list[index]
            }
            
        }
        System.out.println(i + ": " + roman);
        return roman;
//        if(i == 1) return "I";
//        else if (i == 2) return "II";
//        else if(i == 3) return "III";
//        else if(i == 4) return "IV";
//        else if(i == 5) return "V";
//        else if(i == 6) return "VI";
//        else if(i == 7) return "VII";
//        else if(i == 8) return "VIII";
//        else if(i == 9) return "IX";
//        else if(i == 10) return "X";
//        return "XI";
    }
}
