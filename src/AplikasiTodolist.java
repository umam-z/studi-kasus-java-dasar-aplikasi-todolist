public class AplikasiTodolist {

    public static String[] model = new String[10];
    
    public static void main(String[] args) {
        testRemoveTodolist();
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

    public static void testAddTodolist() {
        for (int i = 0; i < 25; i++) {
            addTodolist("Contoh Todolis Ke - " + i);
        }
        showTodolist();
    }

    /**
     * Menghapus todo list
     */
    public static boolean removeTodolist(Integer number) {
        if ((number - 1) >= model.length || number < 0) {
            return false;
        }

        if (model[number - 1] == null) {
            return false;
        } else {
            // model[number - 1] = null;
            for (int i = (number - 1); i < model.length; i++) {
                if (i == (model.length - 1)) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodolist() {
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        addTodolist("Empat");
        addTodolist("Lima");
        addTodolist("Enam");

        // test remove di luar posisi data array postive (false)
        var result = removeTodolist(20);
        System.out.println(result);

        // test remove di luar posisi data array negative (false)
        result = removeTodolist(-3);
        System.out.println(result);

        // test remove data array pada posisi dengan value null (false)
        result = removeTodolist(8);
        System.out.println(result);

        // test remove data array pada posisi dengan value not null (true)
        result = removeTodolist(2);
        System.out.println(result);
        
        // test remove data array paling ujung (true)
        result = removeTodolist(5);
        System.out.println(result);

        showTodolist();
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
