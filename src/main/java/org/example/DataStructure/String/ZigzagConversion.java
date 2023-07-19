package org.example.DataStructure.String;

public class ZigzagConversion {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",3));
    }

    /**
     *  r = 3
     *  i = 0 , gap = 4
     *  i = 1, gap = 2
     *  i = 2, gap = 4
     *  ---------------
     *  r = 4
     *  i = 0, gap = 6 ->   (2 * r) - 2
     *  i = 1, gap = 4      (2 * r) - 2 - 2*i
     *  i= 2, gap = 2
     *  i= 3, gap = 6  -> (2 * r) - 2
     *
     * */
    public static String convert(String s, int numRows) {

        if(numRows == 1)    return s;

        String ans = "";
        int increment = (2 * numRows) - 2;
        for(int i=0;i<numRows;i++) {
            for(int j = i; j<s.length(); j+=increment) {
                ans+= s.charAt(j);
                if(i > 0 && i < numRows - 1 && j + increment - (2 * i) < s.length()){
                    ans+=(s.charAt(j + increment - (2 * i)));
                }
            }
        }
        return ans;
    }
}
