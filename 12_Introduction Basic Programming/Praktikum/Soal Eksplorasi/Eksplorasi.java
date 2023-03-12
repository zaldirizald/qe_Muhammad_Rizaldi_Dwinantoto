import java.util.Scanner;

public class Eksplorasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan teks yang akan dienkripsi: ");
        String teksAsli = input.nextLine();
        String teksEnkripsi = "";

        for (int i = 0; i < teksAsli.length(); i++) {
            char karakter = teksAsli.charAt(i);
            // Cek apakah karakter adalah huruf (A-Z atau a-z)
            if (Character.isLetter(karakter)) {
                // Konversi karakter ke huruf besar
                karakter = Character.toUpperCase(karakter);
                // Geser karakter sebanyak 10 urutan ke kanan
                karakter = (char) ((karakter - 'A' + 10) % 26 + 'A');
            }
            teksEnkripsi += karakter;
        }

        System.out.println("Teks setelah dienkripsi: " + teksEnkripsi);
    }
}