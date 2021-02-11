package kasus;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json {
    public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("smartphone", "aple");
        obj.put("merk", "iphone");
        obj.put("OS", "iOS dan Android");

        JSONArray listTipe = new JSONArray();
        listTipe.add("Iphone 12");
        listTipe.add("Samsung");
        

        obj.put("tipe", listTipe);

        try {

            FileWriter file = new FileWriter("smartphone.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);

    }
}
