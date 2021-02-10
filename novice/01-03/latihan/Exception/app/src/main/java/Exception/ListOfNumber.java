package Exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * ListOfNumber
 */
public class ListOfNumber {

    private static final int SIZE = 10;
    private static List<Integer> list;

    public ListOfNumber() {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    public void writeList() throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

        for (int i = 0; i < SIZE; i++) {
            out.println("Value at : " + i + "=" + list.get(i));
        }
        out.close();
    }

    public static void main(String[] args) {
        ListOfNumber listOfNumber = new ListOfNumber();
    }
}