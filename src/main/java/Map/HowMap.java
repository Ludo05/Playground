package Map;

import java.util.HashMap;
import java.util.Map;

public class HowMap {

    public static void main(String[] args) {

        HashMap m = getMap("Hello",30712);
        System.out.println(m.get("Hello"));

        if(m.containsKey("Hello")){
            m.replace("Hello",m.get("Hello"),3333);
        }
        System.out.println(m.get("Hello"));

    }

    public static HashMap getMap(String v1, int v2) {
        HashMap m = new HashMap();

        m.put(v1,v2);

        return m;
    }
}
