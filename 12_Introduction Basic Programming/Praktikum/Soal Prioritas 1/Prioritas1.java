import java.util.Scanner;

public class Prioritas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // menghitung luas segitiga
        System.out.println("Menghitung Luas Segitiga");
        System.out.print("Masukkan nilai alas: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan nilai tinggi: ");
        double tinggi = input.nextDouble();
        double luas_segitiga = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga: " + luas_segitiga);

        // menghitung luas persegi panjang
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.print("Masukkan nilai panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan nilai lebar: ");
        double lebar = input.nextDouble();
        double luas_persegi_panjang = panjang * lebar;
        System.out.println("Luas persegi panjang: " + luas_persegi_panjang);

        // menghitung luas lingkaran
        System.out.println("Menghitung Luas Lingkaran");
        System.out.print("Masukkan nilai jari-jari: ");
        double jari_jari = input.nextDouble();
        double phi = 3.14;
        double luas_lingkaran = phi * jari_jari * jari_jari;
        System.out.println("Luas lingkaran: " + luas_lingkaran);

        input.close();
    }
}