/*
    Write a function that returns the sum of two numbers.
*/

public class Add {
    public static int add(int param1, int param2){
        return param1 + param2; 
    }
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(0, 1000));
        System.out.println(add(2, -37));
    }
    
}