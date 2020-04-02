import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args){
        HashMap<String, Integer> hashmap=new HashMap<>();
        hashmap.put("gg",1);
        hashmap.put("ww",2);
        hashmap.put("oo",3);

        System.out.println("Initial>>>>>>>>>>"+hashmap);
        System.out.println(">>>>>>>>>>>>>"+hashmap.entrySet());
    }
}
