package HW1;

import java.util.*;

public class Encoding
{
   public static Set<String> morseCodes(int m, int n)
   {
      Set<String> result = new TreeSet<>();
      morseCodesRecurse(m, n, result, "");
      return result;
   }

   private static void morseCodesRecurse(int m, int n, Set<String> set, String temp)
   {
      if (m == 0 && n ==0) {
        set.add(temp);
        return;
      } 
      else if (m == 0) {
        morseCodesRecurse(m, n-1, set, "-"+temp);
        return;
      }
      else if (n == 0) {
        morseCodesRecurse(m-1, n, set, "."+temp);
        return;
      }
      else {
        morseCodesRecurse(m-1, n, set, "."+temp);
        morseCodesRecurse(m, n-1, set, "-"+temp);
        return;
      }
   }
   
   public static void main(String args[])
   {
	   System.out.println(morseCodes(2, 1));
   }
}
