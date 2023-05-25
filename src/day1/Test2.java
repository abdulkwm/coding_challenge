package day1;

public class Test2 {
    private static String solution(String str1){
        String temp = "";
        String str = str1.toLowerCase();
        for (int i = str.length()-1; i >= 0; i--){
            temp = temp + str.charAt(i);
        }
        str.toLowerCase();
        if (str.equals(temp)){
            return "Is Palindrome";
        }else {
            return "Is not Palindrome";
        }
    }
    public static void main(String[] args) {
        System.out.println(solution("abA"));
    }
}
