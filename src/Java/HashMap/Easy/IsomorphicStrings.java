package Java.HashMap.Easy;

import java.util.HashMap;

public class IsomorphicStrings {

    public static boolean IsoChecker(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        HashMap <Character, Character> stringMap = new HashMap<>();
        HashMap <Character, Character> stringMap2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (stringMap.containsKey(c1) && stringMap.get(c1) != c2){
                return false;
            }
            if (stringMap2.containsKey(c2) && stringMap2.get(c2) != c1){
                return false;
            }

            stringMap.put(c1, c2);
            stringMap2.put(c2, c1);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println("Is it Isomorphic?? " + IsoChecker(s, t));
    }
}
