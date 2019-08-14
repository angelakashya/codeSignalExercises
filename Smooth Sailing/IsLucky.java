/* Ticket numbers usually consist of an even number of digits.
A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
Given a ticket number n, determine if it's lucky or not.*/

public class IsLucky {

    public static boolean isLucky(int n) {
        int soma1 = 0;
        int soma2 = 0;
        String s = "" + n;
        char[] lista = s.toCharArray();
    
        for(int i = 0; i < lista.length/2; i++) {
            soma1+= Integer.parseInt(""+ lista[i]); 
        }
    
        for(int i = lista.length/2; i < lista.length; i++) {
            soma2+= Integer.parseInt("" + lista[i]);
        }
        
        if(soma1 == soma2)
            return true;
    
        return false;
        } 
}