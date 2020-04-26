import java.util.ArrayList;
import java.util.HashMap;

public class N299Solution {
    public static void main(String[] args) {
        String  secret = "1887";
        String  guess = "8210";
        System.out.println(getinit(secret,guess));
    }
    public static String getHint(String secret, String guess) {
        int aCount = 0;
        int bCount = 0;
        ArrayList<Character> list = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < secret.length(); i++) {
            char temp = secret.charAt(i);
            if ( temp == guess.charAt(i)) {
                aCount++;
            } else {
                list.add(guess.charAt(i));
                if (map.containsKey(temp)) {
                    map.put(temp,map.get(temp) + 1);
                } else {
                  map.put(temp,1);
                }
            }
        }
        for (Character c : list) {
            if(map.containsKey(c)) {
                bCount++;
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0)
                    map.remove(c);
            }
        }
        return aCount + "A" + bCount + "B";


    }

    public static String getinit(String secret, String guess ) {
        int bulls = 0;
        int cows = 0;
        int[] numbers = new int[10];
        for (int i = 0; i<secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) bulls++;
            else {
                if (numbers[secret.charAt(i)-'0']++ < 0) cows++;
                if (numbers[guess.charAt(i)-'0']-- > 0) cows++;
            }
        }
        return bulls + "A" + cows + "B";
    }
}
