package day1;

import java.util.Arrays;

public class Pollution {
    public int solution(int[] A){
        int n = A.length;
        Arrays.sort(A);
        int totalPollution =  Arrays.stream(A).sum();
        int filteredPollution = 0;
        int numFilters = 0;
        for (int i = n -1; i >= 0; i--){
            filteredPollution += A[i];
            numFilters++;
            if (filteredPollution >= totalPollution/2){
                return numFilters;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Pollution poll = new Pollution();
        int[] A = {5,19,8,1};
        System.out.println(poll.solution(A));
    }
}
