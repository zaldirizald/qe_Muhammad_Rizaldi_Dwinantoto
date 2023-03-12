import java.util.Scanner;


public class Prioritas2no2 {
    public static void main(String[] args) {
        int tinggi;
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        tinggi = input.nextInt();
        input.close();


        int jum = 1;
        for (int i = 1; i <= tinggi; i++) {
            for (int s = tinggi - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int b = 1; b <= jum; b++) {
                if (b % 2 == 0)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            jum += 2;
            System.out.print("\n");
        }
    }
}