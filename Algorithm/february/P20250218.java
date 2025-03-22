package Algorithm.february;

import java.util.HashMap;

public class P20250218 {
  public static void main(String[] args) {
    String word1 = "AbaAeCe";
    String word2 = "baeeACA";
    System.out.println(anagram(word1, word2));
    System.out.println("Clear");
  }

  public static boolean anagram(String word1, String word2) {

    if (word1.length() != word2.length()) {
      return false;
    }
    HashMap<Character, Integer> charCountMap = new HashMap<>();

    for(char c : word1.toCharArray()) {
      charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
    }

    for(char c : word2.toCharArray()) {
      if(!charCountMap.containsKey(c)||charCountMap.get(c)==0) {
        return false;
      }
      charCountMap.put(c,charCountMap.get(c)-1);
    }

    for(int count : charCountMap.values()) {
      if(count != 0){
        return false;
      }
    }
    return true;
  }
}
