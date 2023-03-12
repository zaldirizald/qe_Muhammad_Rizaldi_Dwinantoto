public class Prioritas2 {
    public static void main(String[] args) {
        int nomor1 = 3;
        int nomor2 = 4;
        int nomor3 = 15;
        int nomor4 = 4;
        int nomor5 = 10;
        int nomor6 = 10;
        int nomor7 = 12;
        int nomor8 = 3;

        int sum = add(nomor1, nomor2);
        int difference = subtract(nomor3, nomor4);
        int product = multiply(nomor5, nomor6);
        int quotient = divide(nomor7, nomor8);

        System.out.println("Penjumlahan: " + sum);
        System.out.println("Pengurangan: " + difference);
        System.out.println("Perkalian: " + product);
        System.out.println("Pembagian: " + quotient);
    }

    public static int add(int nomor1, int nomor2) {
        return nomor1 + nomor2 ;
    }

    public static int subtract(int nomor3, int nomor4) {
        return nomor3 - nomor4;
    }

    public static int multiply(int nomor5, int nomor6) {
        return nomor5  * nomor6;
    }

    public static int divide(int nomor7, int nomor8) {
        return nomor7 / nomor8;
    }
}