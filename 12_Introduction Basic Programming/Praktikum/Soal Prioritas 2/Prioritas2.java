public class Prioritas2 {
    public static void main(String[] args) {
        int i, j, k = 0;
        int a = 5;
        for (i =1; i<= a; i++) {
            for (j = 1; j <= a; j++) {
                k++;
                if (k % 3 == 0) { // kelipatan 3 (X)
                    System.out.print("X");
                } else if
                (k % 2 == 0) { // kelipatan genap (Z)
                    System.out.print("Z");
                } else {
                    System.out.print("Y");// kelipatan ganjil (Y)
                }
            }
            System.out.println(); // print setiap baris
        }
    }
}

