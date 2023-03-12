import java.util.Scanner;

public class Prioritas1no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Harga beli: ");
        int Beli = scanner.nextInt();
        System.out.print("Harga jual: ");
        int Jual = scanner.nextInt();

        int keuntungan = Jual - Beli;

        if (keuntungan > 0) {
            System.out.println("Untung sebesar: " + keuntungan);
        } else if (keuntungan < 0) {
            System.out.println("Rugi sebesar: " + keuntungan);
        } else {
            System.out.println("Sama saja");
        }

        scanner.close();
    }
}