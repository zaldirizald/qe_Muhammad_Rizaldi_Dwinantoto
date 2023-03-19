import java.util.ArrayList;
import java.util.HashSet;

public class no4 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 3, 5, 10, 16};
        int[] array3 = {3, 8};
        int[] array4 = {2, 8};

        int[] result1 = getUnique(array1, array2);
        int[] result2 = getUnique(array3, array4);

        System.out.print("Output 1: ");
        printArray(result1);
        System.out.print("Output 2: ");
        printArray(result2);
    }

    public static int[] getUnique(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array2) {
            set.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : array1) {
            if (!set.contains(num)) {
                list.add(num);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}