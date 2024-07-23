package leetCode;

import java.util.Arrays;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("XIX"));
    }

    public static int romanToInt(String s) {
        int res = 0;

        char[] c = s.toCharArray();
        int[] array = new int[c.length];

        for (int i = 0; i < c.length; i++) {
            switch (c[i]) {
                case 'I':
                    array[i] = 1;
                    break;
                case 'V':
                    array[i] = 5;
                    break;
                case 'X':
                    array[i] = 10;
                    break;
                case 'L':
                    array[i] = 50;
                    break;
                case 'C':
                    array[i] = 100;
                    break;
                case 'D':
                    array[i] = 500;
                    break;
                case 'M':
                    array[i] = 1000;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal character " + c[i]);

            }
        }
        System.out.println(Arrays.toString(array));
        int numb = array[0];
        res += numb;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < numb && array[i] == numb) {
                res += array[i];
                numb = array[i];
            } else {
                res += array[i] - numb - numb;
            }
        }
        return res;
    }
}
