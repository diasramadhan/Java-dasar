public class Continue {
    public static void main(String[] args) {

        for (var i = 1; i < 10; i++){

            if (i % 2 == 0){
                continue;
            }
            System.out.println("Perulangan ganjil : " + i);
        }

        var j = 0;
        while (j <= 10){
            j++;
            if(j % 2 == 1){
                continue;
            }
            System.out.println("Perulangan genap : " + j);

        }

    }
}
