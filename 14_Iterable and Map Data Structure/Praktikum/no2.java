import java.util.*;

public class no2 {

    public static void main(String[] args) {

        String input = "76523752";

        List<Integer> unique = findUniqueNumbers(input);

        System.out.println(unique.toString());

        String input2 = "1122";
        List<Integer> unique2 = findUniqueNumbers(input2);
        System.out.println(unique2.toString());
    }

    public static List<Integer> findUniqueNumbers(String input) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        List<Integer> unique = new ArrayList<Integer>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                unique.add(Character.getNumericValue(entry.getKey()));
            }
        }

        return unique;
    }
}