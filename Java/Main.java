package academy.learnprogramming;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String n = "9006";
        System.out.println("Is " + n + " is Strobogrammatic: " + is_Strobogrammatic(n));
    }
    public static boolean is_Strobogrammatic(String n) {
        if (n == null || n.length() == 0) {
            return true;
        }
        HashMap< Character, Character > map = new HashMap < Character, Character > ();
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');
        int left = 0;
        int right = n.length() - 1;
        while (left <= right) {
            if (!map.containsKey(n.charAt(right)) || n.charAt(left) != map.get(n.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
