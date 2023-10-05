import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(isAnagramV2("rat","car"));
    }

    public static boolean isAnagramV1(String s, String t) {
        //for some reason this variant doesnt work :( the last test fails
        if(s.length() != t.length())
            return false;

        HashMap<Character,Integer> mapStr1 = new HashMap<>();
        HashMap<Character,Integer> mapStr2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            mapStr1.put(s.charAt(i), mapStr1.getOrDefault(s.charAt(i), 0) + 1);

            mapStr2.put(t.charAt(i), mapStr2.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (Character key : mapStr1.keySet()) {
            if(mapStr1.get(key) != mapStr2.get(key))
                return false;
        }
        return true;
    }

    public static boolean isAnagramV2(String s, String t) {
        if(s.length() != t.length())
            return false;

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }
        // if symbol exists in each string - the key will be 0, else other value

        for (Character key : map.keySet()) {
            if(map.get(key) != 0)
                return false;
        }
        return true;
    }
}