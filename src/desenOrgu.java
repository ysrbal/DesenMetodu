import java.util.Scanner;


public class desenOrgu {

    static int orgu1(int n) {
        if (n <= 0) {
            return n;
        } else {
            System.out.println(n + " ");
            return orgu1(n - 5);
        }

    }

    static int orgu2(int n, int temp) {
        if (n > temp) {
            return n;
        } else {
            System.out.println(n + " ");
            return orgu2(n + 5, temp);
        }
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen Bir Sayi Giriniz : ");
        int n = inp.nextInt();

        orgu2(orgu1(n), n);
    }
}
