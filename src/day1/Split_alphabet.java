package day1;

public class Split_alphabet {
    public int solution(String S) {
        int[] lastSeen = new int[26];
        int start = 0, end = 0, count = 0;
        for (int i = 0; i < S.length(); i++){
            int index = S.charAt(i) - 'a';
            end = Math.max(end, lastSeen[index]);
            if (end == i) {
                count++;
                start = i + 1;
            }
            lastSeen[index] = i + 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Split_alphabet solution = new Split_alphabet();

        System.out.println(solution.solution("djfkshahfiosja"));
    }
}
