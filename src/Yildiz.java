import java.util.Scanner;

//girilen basamak sayisi kadar yıldızlarla üçgen yapımı

public class Yildiz {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz:");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= (n - 1); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*(n-i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();


        }


    }
}


