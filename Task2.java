package SeminarsHW.HW5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Map<String,Integer> mapList = new HashMap<>();
        String text = "Live for a century - learn for a century.";        
        String[] arr = text.toLowerCase().split("\\s*(\\s|,|-|\\(|\\)|\\.)\\s*");
        
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.nextLine();
            for (int i = 0; i < arr.length; i++) {
                mapList.putIfAbsent(arr[i], 0);
                mapList.put(arr[i], mapList.get(arr[i])+1);
            }
            System.out.println(word + " встречается " + mapList.get(word) + " раз(а)");
        }
    }
}
