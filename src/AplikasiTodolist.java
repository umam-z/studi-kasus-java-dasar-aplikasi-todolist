public class AplikasiTodolist {

    public static String[] model = new String[10];
    
    public static void main(String[] args) {
        testShowTodolist();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodolist() {
        for (int i = 0; i < model.length; i++) {
            String todo = model[i];
            int no = i + 1;

            if (todo != null) {
                System.out.println(no +". "+ todo);
            }
        }
    }

    public static void testShowTodolist() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar : Aplikasi Todolist";
        showTodolist();
    }

    /**
     * Menambahkan todo list
     */
    public static void addTodolist(String todo) {
        var isFull = true;

        // cek apakah model penuh
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                isFull = false;
                break;
            }
        }

        // jika penuh resize ukuran array 2x lipat
        if (isFull) {
            var tmp = model;
            model = new String[model.length * 2];
            for (int i = 0; i < tmp.length; i++) {
                model[i] = tmp[i];
            }
        }

        // tambahkah ke posisis data array-nya null
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    /**
     * Menghapus todo list
     */
    public static void removeTodolist() {

    }

    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodolist() {

    }

    /**
     * Manampilkan view menambahkan todo list
     */
    public static void viewAddTodolist() {

    }

    /**
     * Menampilkan view menghapus todo list
     */
    public static void viewRemoveTodolist() {

    }
}
