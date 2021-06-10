public class PuzzleJavaTest {
	public static void main(String[] args){
		PuzzleJava iD = new PuzzleJava();
		int[] array = {3,5,1,2,7,9,8,13,25,32};
		System.out.println(iD.arraySum(array));

		String[] strArray = {"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
		iD.arrayNames(strArray);
		iD.alphabet();
        iD.randomIntArray();
        iD.sortedRandomIntArray();
        System.out.println(iD.randomString());
        System.out.println(iD.randomStringArray());
	}
}