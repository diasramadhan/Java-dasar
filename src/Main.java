import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int luas;
        int nilai;

        Scanner io = new Scanner(System.in);
        System.out.print("Menghitung Luas Persegi : ");
        luas = io.nextInt();
        int sisi;
        System.out.print("Masukan sisi : ");
        sisi = io.nextInt();
        if (luas == sisi * sisi) {
            System.out.print("Luas persegi : " + luas);
        }else {
            System.out.println("Tidak valid");
        }


    }
}
