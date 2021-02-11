package koleksiinter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColectIn {

    public static void main(String[] args) {

        List a1 = new ArrayList();
        a1.add("Zara");
        a1.add("Mahnaz");
        a1.add("Ayan");
        System.out.println(" ArrayList Elements");
        System.out.print("\t" + a1);

        List l1 = new LinkedList();
        l1.add("Zara");
        l1.add("Mahnaz");
        l1.add("Ayan");
        System.out.println();
        System.out.println(" LinkedList Elements");
        System.out.print("\t" + l1);

        Set s1 = new HashSet();
        s1.add("Zara");
        s1.add("Mahnaz");
        s1.add("Ayan");
        System.out.println(" Set Elements");
        System.out.print("\t" + s1);

        Map m1 = new HashMap();
        m1.put("Zara","8");
        m1.put("Mahnaz","31");
        m1.put("Ayan","12");
        m1.put("Daisy","14");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);

    }

}
