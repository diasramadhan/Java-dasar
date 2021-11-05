import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        String arrayString [];
        arrayString = new String[3];
        arrayString[0] = "Dias";
        arrayString[1] = "Nur";
        arrayString[2] = "Ramadhan";

        for (var name : arrayString) {
            System.out.println(name);
        }

        System.out.println("=== Change Name ===");
        arrayString[0] = "Noemala";
        for (var name : arrayString) {
            System.out.println(name);
        }

        String arrayString2[] = new String[3];

        String names[] = {
                "Dias","Nur","Ramadhan"
        };

        for (var name : names ) {
            System.out.println(name);
        }

        names[0] = null;
        for (var name : names ) {
            System.out.println(name);
        }

        System.out.println("===== array int =====");
        int arrayInt [] = {
                1,2,3,4,5,6,63,2
        };
        for (var value :
                arrayInt) {
            System.out.println(value);
        }

        long arrayLong[] = {
                1_000_000_000,1_000_000_000_000L
        };
        for (var value :
                arrayLong) {
            System.out.println(value);
        }

        System.out.println(arrayLong.length);

        String array2D[][] = new String[][]{
                {"Dias","Nganjuk"},
                {"Noermala","Prambon"}
        } ;

        for (var i = 0; i < array2D.length; i++){
                System.out.println("Nama    : " + array2D[i][0]);
                System.out.println("Alamat  : " + array2D[i][1]);
        }

        //petani kode
        String bangkuDuduk[][] = {
                {"Dias","Mala"},
                {"Nur","Riska"},
                {"Ramadhan","Agustin"}
        };
        for (var i = 0; i < bangkuDuduk.length; i++){
            for (var j = 0; j < bangkuDuduk[i].length; j++){
                System.out.format("| %s | \t",bangkuDuduk[i][j]);
            }
            System.out.println();
        }

    }
}
