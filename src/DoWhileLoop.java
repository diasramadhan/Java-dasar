import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        var counter = 0;

        do {
            System.out.println(counter);
            counter++;
        }while (counter <= 10);

        String repeat = null;
        do {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Ulangi : ");
            repeat = scanner.nextLine();

        }while(! repeat.equals("y") );
    }
}
