import java.util.Comparator;

public class TodoSortByDate implements Comparator<TodoItem> {

    /**
     * menggunakan anotasi overrride dalam get date tanggal input data
     */
    @Override
    public int compare(TodoItem o1, TodoItem o2) {
        return o1.getCurrent_date().compareTo(o2.getCurrent_date());

    }
}
