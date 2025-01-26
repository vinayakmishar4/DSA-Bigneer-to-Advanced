package STRING.MEDUIM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sortbyfreq
{
    public String frequencySort(String s)
    {
       int[] freq = new int[256]; // Assuming ASCII characters
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        // Step 2: Store characters and their frequencies in a list
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                chars.add((char) i);
            }
        }

        // Step 3: Sort characters by frequency in descending order
        chars.sort((a, b) -> freq[b] - freq[a]);

        // Step 4: Build the result string
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            for (int i = 0; i < freq[c]; i++) {
                result.append(c);
            }
        }
        return result.toString();
    } 
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a string:");
       String s = scanner.nextLine();
       Sortbyfreq obj = new Sortbyfreq();
       System.out.println("Sorted string by frequency: " + obj.frequencySort(s));
    }   
}
