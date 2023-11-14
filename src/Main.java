import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
//p.1
public class Main {
    public static void main(String[] args)

    { Map<String, Integer> sourceMap = new HashMap<>();
        sourceMap.put("MAP_A", 1);
        sourceMap.put("MAP_B", 2);

        Map<String, Integer> destinationMap = new HashMap<>(sourceMap);
        System.out.println("Sursa Map: " + sourceMap);
        System.out.println("Destinatia Map: " + destinationMap);
        System.out.println();

        Queue<Map.Entry<String, Integer>> destinationQueue = new LinkedList<>(sourceMap.entrySet());
        System.out.println("Sursa Map: " + sourceMap);
        System.out.println("Destinatia Queue: " + destinationQueue);
        System.out.println();

        Stack<Map.Entry<String, Integer>> destinationStack = new Stack<>();
        destinationStack.addAll(sourceMap.entrySet());
        System.out.println("Sursa Map: " + sourceMap);
        System.out.println("Destinatia Stack: " + destinationStack);
        System.out.println();

        Queue<Map.Entry<String, Integer>> sourceQueue = new LinkedList<>();
        sourceQueue.add(Map.entry("MAP_A", 1));
        sourceQueue.add(Map.entry("MAP_B", 2));
        Map<String, Integer> destinatiaMap = new HashMap<>();
        sourceQueue.forEach(entry -> destinatiaMap.put(entry.getKey(), entry.getValue()));
        System.out.println("Sursa Queue: " + sourceQueue);
        System.out.println("Destinatia Map: " + destinationMap);
    }




}
