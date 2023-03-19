public class no3 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 6};
        int target = 6;
        int[] indices = findPairSum(array, target);
        int[] array2 = {2, 5, 9,11};
        int target2 = 11;
        int[] indices2 = findPairSum(array2, target2);

        if (indices != null) {
            System.out.println(indices[0] + ", " + indices[1]);
            System.out.println(indices2[0] + ", " + indices2[1]);
        } else {
            System.out.println("Tidak ada pasangan yang ditemukan dengan jumlah yang diberikan.");
        }
    }

    public static int[] findPairSum(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return null;
    }
}