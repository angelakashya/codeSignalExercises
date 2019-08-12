
/*Given an array of strings, return another array containing all of its longest strings.*/

public class AllLongestStrings {

    public static String[] allLongestStrings(String[] inputArray) {
    	int maior = inputArray[0].length();
		int quantidade = 0;
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i].length() > maior)
				maior = inputArray[i].length();
		}
		
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].length() == maior) {
				quantidade++;

			}
		}

		String[] maiores = new String[quantidade];
		int indice = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].length() == maior) {
				maiores[indice++] = inputArray[i];
			}
		}

		return maiores;

	}    
}