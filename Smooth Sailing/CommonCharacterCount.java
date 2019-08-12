/* Given two strings, find the number of common characters between them.*/


public class CommonCharacterCount {
    
    public static int commonCharacterCount(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char [] c2 = s2.toCharArray();
        int result = 0;

        for(int i = 0; i< c1.length; i++) {
            for(int j = 0; j < c2.length; j ++) {

                if(c1[i] == c2[j]) {
                  result ++;
                  s2 = s2.replaceFirst(String.valueOf(c2[j]), "");
                  c2 = s2.toCharArray();
                 break;   
                }
            }
        }
        return result; 
    }

    public static void main(String[] args) {
        System.out.println(commonCharacterCount("aabcc", "adcaa"));
    }
}