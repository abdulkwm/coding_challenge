package day1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UniqueElement {
    public static void main(String[] args) {
        int [] input = {15,12,15,17,19,12,12};
        boolean isDuplicate;
        for (int i = 0; i < input.length; i++){
            isDuplicate = false;
            for (int j = i + 1; j < input.length; j++){
                if (input[i] == input[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                System.out.print(input[i] + " ");
            }
            Arrays.sort(input);
        }
        System.out.println();
        Set<Integer> uniqueValue = new TreeSet<>();
        for (int i = 0; i < input.length; i++){
            uniqueValue.add(input[i]);
        }
        for (int value : uniqueValue){
            System.out.print(value + " ");
        }
    }
}
