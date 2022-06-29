import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayisi giriniz : ");
        int n = 0;
        n = input.nextInt();
        for (int i = n - 1; i >= 0; i--) {
            for (int k = n - i; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int j = (2 * i) - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
