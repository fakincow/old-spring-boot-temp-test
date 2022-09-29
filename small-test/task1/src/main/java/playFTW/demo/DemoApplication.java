package playFTW.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class DemoApplication {
	/*
bool IsValid(string word)

Examples:

Letter | followers | Final Can be on end of word
--------------------------------------
a | [a,b,d] | true
b | [a,f] | false
c | [a] | true

O(k)

ac => not valid - c cannot be after a (Followed)
ab => not valid - b cannot be final
aba => valid

31 (*) Split into as many classes / interfaces as needed
(*) Create clean code
(*) No need for validation - assume all inputs are valid
	*/
	public static HashMap<String, validationCase> validators = new HashMap<String, validationCase>();
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		validators.put("a", new validationCase("a", new String[]{"a","b","d"},true));
		validators.put("b", new validationCase("b", new String[]{"a","f"},false));
		validators.put("c", new validationCase("c", new String[]{"a"},true));
		String[] testArray = new String[]{"ac","ab","aba"};
		for (String stringCase : testArray){
			testFun(stringCase);
		}
	}
	public static void testFun(String someString) {
		String[] inputData = someString.split("");
		// test lasts
		String lastSymbol = inputData[inputData.length -1];
		validationCase myValidator = validators.get(lastSymbol);
		if(!myValidator.getCanBeFinal()){
			System.out.println(someString+ " not valid  " + lastSymbol + "  cannot be final");
			return;
		}
		for (int i = 0; i < inputData.length - 1; i++) {
			// test followers
			myValidator = validators.get(inputData[i]);
			String[] followers = getSlice(inputData, i+1, inputData.length);
			String failedKey = myValidator.validateFollowers(followers);
			if(failedKey != null){
				System.out.println(someString + " not valid  " + failedKey + "  cannot be after "+inputData[i]+" (Followed)");
				return;
			}
		}
		System.out.println(someString + "  valid");
	}
	public static String[] getSlice(String[] array, int startIndex, int endIndex)
	{
		String[] slicedArray = new String[endIndex - startIndex];
		for (int i = 0; i < slicedArray.length; i++)
		{
			slicedArray[i] = array[startIndex + i];
		}
		return slicedArray;
	}

}
