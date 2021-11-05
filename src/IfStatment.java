public class IfStatment {
    public static void main(String[] args) {

        var nilaiA = 50;
        var nilaiB = 51;

        var avg = (nilaiA + nilaiB)/2;
        var absen = 56;

        var lulusAkd = avg > 50;
        var lulusAbsen = absen > 50;

        if (lulusAkd && lulusAbsen){
            System.out.println("Anda Lulus");
            System.out.println("Nilai Akd : " + avg);
            System.out.println("Nilai Absen : " + absen);
        }else {
            System.out.println("Lebih baik mengulang");
            System.out.println("Nilai : " + avg);
        }


    }
}
