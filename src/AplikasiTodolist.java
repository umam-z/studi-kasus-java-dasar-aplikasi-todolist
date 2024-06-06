public class AplikasiTodolist {

    public static String[] model = new String[10];
    
    public static void main(String[] args) {
        
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

    /**
     * Menambahkan todo list
     */
    public static void addTodolist() {

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
