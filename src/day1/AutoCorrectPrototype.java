package day1;

import java.util.*;

public class AutoCorrectPrototype {
    public static List<List<String>> getSearchResults(String[] words, String[] queries){
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String word : words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            List<String> anagrams = anagramMap.getOrDefault(sorted,new ArrayList<>());
            anagrams.add(word);
            anagramMap.put(sorted, anagrams);
        }
        List<List<String>> results = new ArrayList<>();
        for (String query : queries){
            char[] chars = query.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            List<String> anagrams = anagramMap.getOrDefault(sorted, new ArrayList<>());
            Collections.sort(anagrams);
            results.add(anagrams);
        }
        return results;
    }

    public static void main(String[] args) {
        String[] words = {"duel", "speed", "dule", "cars"};
        String[] queries = {"spede", "deul"};
        List<List<String>> searchResults = getSearchResults(words, queries);
        System.out.println(searchResults);
    }
}
