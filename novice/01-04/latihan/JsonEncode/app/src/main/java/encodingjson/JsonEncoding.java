package encodingjson;
import org.json.simple.JSONObject;
/**
 * JsonEncoding
 */
public class JsonEncoding {

    public static void main(String[] args) {
        JSONObject obj = new JSONObject();

        obj.put("nama", "foo");
        obj.put("nama", new Integer(100));
        obj.put("nama", new Double(1000.21));
        obj.put("nama", new Boolean(true));
        System.out.println(obj);

    }
}