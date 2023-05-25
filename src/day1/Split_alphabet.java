package day1;

import java.util.HashSet;
import java.util.Set;

public class Split_alphabet {
    private static int solution(String str) {
//        int count = 0;
//        for (int i = 0; i < str.length(); i++){
//            boolean isRepeated = false;
//            for (int j = 0; j < str.length(); j++){
//                if ( i!= j && str.charAt(i) == str.charAt(j)){
//                    isRepeated = true;
//                    break;
//                }
//            }
//            if (!isRepeated){
//                count++;
//            }
//        }
//        return count;
        Set<Character> unique = new HashSet<>();
        int count  = 0;
        for (char c : str.toCharArray()){
            if (unique.contains(c)){
                unique.clear();
                count++;
            }
            unique.add(c);
        }
        return count + 1;
    }
    public static void main(String[] args) {

        System.out.println(solution("wlorld"));
    }
}
