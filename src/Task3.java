import java.util.HashMap;
import java.util.Map;

public class Task3 {
    private static final Map<String, Integer> MAP = new HashMap<>();
    public static void main(String [] args){
        for (int i = 0; i < 10; i++) {
            MAP.put(String.valueOf(i), i);
        }
        System.out.println(MAP);
        tryPut("10",10);
        System.out.println(MAP);
        tryPut("10",11);
        System.out.println(MAP);
        tryPut("10",11);
        System.out.println(MAP);

    }
    private static void tryPut(String key, Integer valeu){
        if(MAP.containsKey(key) && MAP.get(key).equals(valeu)){
            throw new IllegalArgumentException("Такой ключ и значение уже есть в карте!");
        }
        MAP.put(key, valeu);
    }
}
