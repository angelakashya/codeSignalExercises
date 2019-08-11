/*
    Given the string, check if it is a palindrome.
*/

class CheckPalindrome {

    public static boolean checkPalindrome(String inputString) {
        char[] arr = inputString.toCharArray();

        for(int i = 0; i < arr.length / 2; i++)
            if (arr[arr.length - i - 1] != arr[i])
                return false;

        return true;
    }  
    
    public static void main(String[] args) {
        System.out.println(checkPalindrome("aabaa"));
        System.out.println(checkPalindrome("abac"));
        System.out.println(checkPalindrome("a"));
        System.out.println(checkPalindrome("az"));
    }
}