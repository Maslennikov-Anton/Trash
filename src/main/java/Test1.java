import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {

        Map<String,String> a = new HashMap<>();
        System.out.println(a.put(null,null));
        System.out.println(a.put("a","a"));
        System.out.println(a.put("a","b"));


        //System.out.println(a.size());
//        System.out.println(a.values());
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//        ArrayBasedMap<String,String> b = new ArrayBasedMap<>();
//        //b.put(null,null);
//
//        System.out.println(b.values());




    }
}
