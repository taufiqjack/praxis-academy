import java.util.Comparator;

public class TodoSortByName implements Comparator<TodoItem> {

    /**
     * menggunakan anotasi override dalam menggunakan rincian list name
     */

    @Override
    public int compare(TodoItem o1, TodoItem o2) {
        return o1.getTitle().compareTo(o2.getTitle());

    }
}
