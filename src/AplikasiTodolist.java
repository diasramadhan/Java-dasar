import java.util.Scanner;

public class AplikasiTodolist {
    static Scanner scanner = new Scanner(System.in);
    static String model[] = new String[10];

    static void testShowTodolist(){
        model[0] = "Belajar Alpro";
        model[1] = "Belajar Basdat";
        model[3] = null;
        showTodoList();
    }
    static void testAddTodolist(){
        addTodolist("Belajar Bahasa Inggris");
        addTodolist("Belajar Fundamental Java");
        for (var i = 0; i < 20; i++){
            addTodolist("Data ke" + i);
        }
//        showTodoList();
    }

    static void testRemoveTodolist(){
        testAddTodolist();
        removeTodolist(1);
        showTodoList();
    }

    public static void main(String[] args) {
        viewShowTodoList();
    }

    /**
     * Menampilkan todolist
     */
    static void showTodoList(){
        System.out.println("=== TODO LIST ===");
        for (var i = 0; i < model.length; i++ ){
            var todo = model[i];
            var no = i + 1;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    /**
     * cek todolist
     */
    static boolean isFull(){
        var isFull = true;
        for (var i = 0; i < model.length; i++){
            if (model[i] == null){
                //model masih ada yang kosong
                isFull = false;
            }
        }
        return isFull;
    }

    static void resizeIfFull(){
        //jika penuh resize uk 2x lipat
        if (isFull()){
            var temp = model;
            model = new String[model.length*2];

            for (var i =0; i < temp.length; i++){
                model[i] = temp[i];
            }
        }
    }

    /**
     * Menambahkan todolist
     */
    static void addTodolist(String Todolist){
        resizeIfFull();
        for (var i = 0; i < model.length; i++){
            if (model[i] == null){
                model[i] = Todolist;
                break;
            }
        }
    }

    /**
     * Remove Todolist
     */

    static boolean removeTodolist(int number){
        if ((number-1) >= model.length){
            return false;
        }else if (model[number-1] == null){
            return false;
        }else {
            for (int i = 0; i < model.length; i++){
                if (i == (model.length-1)){
                    model[i] = null;
                }else {
                    model[i] = model[i+1];
                }
            }
            return true;
        }
    }

    static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    /**
     * Menampilkan view show todolist
     */
    static void viewShowTodoList(){
        while (true){
            showTodoList();

            System.out.println("=== MENU ===");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");

            if (input.equalsIgnoreCase("1")){
                viewAddTodolist();
            }else if (input.equalsIgnoreCase("2")){
                viewRemoveTodolist();
            }else if (input.equalsIgnoreCase("x")){
                break;
            }else {
                System.out.println("Pilihan tidak dimengerti");
            }

        }
    }

    static void viewAddTodolist(){
        System.out.println("=== Menambah Todolist ===");
        var todo = input("Todo (x jika batal)");
        if (todo.equalsIgnoreCase("x")){
            //batal
        }else {
            addTodolist(todo);
        }
    }

    static void viewRemoveTodolist(){
        System.out.println("=== Menghapus Todolist ===");
        var todo = input("Todo nomor (x jika batal)");
        if (todo.equalsIgnoreCase("x")){
            //batal
        }else {
            boolean SUCCESS = removeTodolist(Integer.valueOf(todo));
            if (SUCCESS){
                System.out.println("Berasil menghapus todo : \"" + todo);
            }else {
                System.out.println("Gagal menghapus todo no : " + todo);
            }
        }
    }
}
