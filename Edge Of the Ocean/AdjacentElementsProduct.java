/*Given an array of integers, find the pair of adjacent elements that has the largest product and return that product*/ 

public class AdjacentElementsProduct {

    public int adjacentElementsProduct(int[] inputArray) {
    int resultado = inputArray[0]*inputArray[1];
        
        for(int i = 0; i <inputArray.length - 1; i++){

            if(resultado<inputArray[i]*inputArray[i+1])
                resultado = inputArray[i]*inputArray[i+1];
        }
        return resultado;
    }    

    public static void main(String[] args) {

        System.out.println(adjacentElementsProduct([3, 6, -2, -5, 7, 3]));
    }
}