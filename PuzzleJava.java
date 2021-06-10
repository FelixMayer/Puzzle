import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.List;

public class PuzzleJava {
	public ArrayList<Integer> arraySum(int[] array){
		int sum = 0;
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
			if(array[i] > 10){
				newArray.add(array[i]);
			}
		}
		System.out.println(sum);
		return newArray;
	}

	public String[] arrayNames(String[] array) {
		List<String> listOfNames = Arrays.asList(array);
		List<String> newList = new ArrayList<String>();
		Collections.shuffle(listOfNames);
		for(int i = 0; i < listOfNames.size(); i++){
			System.out.println(listOfNames.get(i));
			if(listOfNames.get(i).length() > 5) {
				newList.add(listOfNames.get(i));
			}
		}
		 String[] newArr = new String[newList.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = newList.get(i);
        }
		System.out.println(Arrays.toString(newArr));
        return newArr;
	}

    public void alphabet() {
    String[] alphabetArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    
    List<String> alphabetList = Arrays.asList(alphabetArray);
    Collections.shuffle(alphabetList);
    
    String[] shuffledArray = new String[alphabetList.size()];
    for (int i = 0; i<shuffledArray.length; i++) {
        shuffledArray[i] = alphabetList.get(i);
    }

    System.out.println("Last Letter: " + shuffledArray[shuffledArray.length-1]);
    System.out.println("First Letter: " + shuffledArray[0]);
    if(shuffledArray[0].equals("a") || shuffledArray[0].equals("e") || shuffledArray[0].equals("i") || shuffledArray[0].equals("o") || shuffledArray[0].equals("u")) {
        System.out.println("The first letter within the array, is a vowel.");
    }
    }

    public int[] randomIntArray() {
    int[] intArray = new int[10];
    Random random = new Random();
    for(int i = 0; i < intArray.length; i++) {
        intArray[i] = random.nextInt((100-55) + 1) + 55;
    }
    System.out.println(Arrays.toString(intArray));
    return intArray;
    }
    
    public int[] sortedRandomIntArray() {
        int [] intArray = new int[10];
        Random random = new Random();
        for(int i = 0; i<intArray.length; i++) {
            intArray[i] = random.nextInt((100-55) + 1) + 55;
        }
        
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println("Smallest number: " + intArray[0]);
        System.out.println("Largest number: " + intArray[intArray.length-1]);
        
        return intArray;
    }

    public String randomString() {
        Random random = new Random();
        char[] charArray = new char[5];
        for(int i=0;i<charArray.length;i++) {
            int randomInt = random.nextInt((122 - 97) + 1) + 97;
            charArray[i] = (char) randomInt;
        }
        String newString = Arrays.toString(charArray);        
        return newString;
    }

    public String[] randomStringArray() {
        String[] stringArray = new String[10];
        for(int i = 0; i<stringArray.length;i++) {
            stringArray[i] = randomString();
        }
        return stringArray;
    }
}