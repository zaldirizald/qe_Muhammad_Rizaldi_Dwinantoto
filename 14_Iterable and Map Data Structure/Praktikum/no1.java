import java.util.*;

public class no1 {

    public static void main(String[] args) {

        String[] array1 = {"kazuya", "jin", "lee"};
        String[] array2 = {"kazuya", "feng"};

        String[] merged = mergeArrays(array1, array2);
        System.out.println(Arrays.toString(merged));

        String[] array3 = {"lee", "jin"};
        String[] array4 = {"kazuya", "panda"};

        String[] merged2 = mergeArrays(array3, array4);
        System.out.println(Arrays.toString(merged2));
    }


    public static String[] mergeArrays(String[] array1, String[] array2) {

        Set<String> set = new HashSet<String>();

        for (String s : array1) {
            set.add(s);
        }

        for (String s : array2) {
            set.add(s);
        }

        String[] result = new String[set.size()];
        int i = 0;
        for (String s : set) {
            result[i++] = s;
        }

        return result;
    }
}