package chatgptQues;
import java.util.*;

/*
 * Problem Statement
 * Write a Java program to find the first non-repeating character in a given string. If all characters repeat, return -1.

Example:
Input: "swiss"
Output: 'w'

Input: "aabbcc"
Output: -1

Constraints:

The input string will contain only lowercase English letters.
Try to solve it with a time complexity of O(n).*/

public class FirstNonRepeativeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String");
		String input = sc.nextLine();
		ArrayList<Character> sample = new ArrayList<Character>();
		
		for (int i=0;i<input.length();i++){
		    if(sample.contains(input.charAt(i))){
		        sample.remove(Character.valueOf(input.charAt(i)));
		    }else{
		        sample.add(input.charAt(i));
		    }
		}
		if(sample.size() == 0){
		    System.out.println(-1);
		}else{
		    System.out.println(sample.get(0));
		}
		sc.close();
	}
}
/*import java.util.LinkedHashMap;//GPT Code
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static char firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count the frequency of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return '-';
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = firstNonRepeatingCharacter(input);
        
        if (result != '-') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("All characters are repeating.");
        }
    }
}
 */