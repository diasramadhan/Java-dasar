public class Break {
    public static void main(String[] args) {

        var counter = 1;
        while (true){
            System.out.println("Perulangan ke-" + counter);

            if (counter == 10){
                break;
            }
            counter++;
        }

        System.out.println("=== FOR ===");
        for (counter = 1;counter < 100;counter++){
            System.out.println("Perulangan ke-" + counter);

            if (counter == 10){
                break;
            }
        }


    }
}
