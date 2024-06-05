import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Frequency {
    public static void main(String[] args) {
        String input = "Hello, World!";
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each character
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Print frequencies of each character
        System.out.println("Frequency of each character:");
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        // Sort the map by values (frequencies)
        Map<Character, Integer> sortedFrequencyMap = new TreeMap<>((c1, c2) -> {
            int freqCompare = frequencyMap.get(c1).compareTo(frequencyMap.get(c2));
            if (freqCompare == 0) {
                return c1.compareTo(c2);
            }
            return freqCompare;
        });
        sortedFrequencyMap.putAll(frequencyMap);

        // Print characters sorted by frequencies in ascending order
        System.out.println("\nCharacters sorted by frequencies in ascending order:");
        sortedFrequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}


