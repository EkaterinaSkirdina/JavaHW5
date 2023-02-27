package SeminarsHW.HW5;

import java.util.HashMap;
import java.util.Map;


public class Task1 {
    public static void main(String[] args) {
        String str = "Россия идет вперед всей планеты. Планета - это не Россия.";
        Map<String,Integer> mapList = new HashMap<>();        
        String[] array = str.toLowerCase().split("\\s*(\\s|-|\\.)\\s*");
        for (int i = 0; i < array.length; i++) {
            mapList.putIfAbsent(array[i], 0);
            mapList.put(array[i], mapList.get(array[i])+1);
        }
        for (var  entry : mapList.entrySet()) {
            System.out.println("Слово '" + entry.getKey() + "' встретилось " + entry.getValue() + " раз(а)");
        }
    }
}
