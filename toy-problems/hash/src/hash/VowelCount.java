package hash;

//VOWEL COUNT

//Using JAVA, create a VowelCount class with a vowelCount method and a main method.
//The vowelCount method should contain the algorithm and the main method
//should be used for testing your algorithm.To make testing easier, make the vowelCount method static.

//Given an input of a String sentence, count the number of vowels that occur in the sentence.
//Return a HashMap object containing the vowels as keys and their counts as values.

//Example:
//HashMap vowelMap = VowelCount.vowelCount("mary had a little lamb");
//vowelMap.get('a'); // 4
//vowelMap.get('i'); // 1
//vowelMap.get('e'); // 1
//vowelMap.get('o'); // null
//HashMap vowelMap = VowelCount.vowelCount("do we control our computers, or do they control us?");
//vowelMap.get('o'); // 8
//vowelMap.get('i'); // 3
//vowelMap.get('e'); // 3
//vowelMap.get('u'); // 3
import java.util.*;

public class VowelCount {
 public static HashMap<Character, Integer> vowelCount(String x){
	x = x.toLowerCase();
	int a, e, i, o, u;
	a = e = i = o = u = 0;
	for(int g = 0; g < x.length(); g++){
		if(x.charAt(g) == 'a')
			a++;
		else if(x.charAt(g) == 'e')
			e++;
		else if(x.charAt(g) == 'i')
			i++;
		else if(x.charAt(g) == 'o')
			o++;
		else if(x.charAt(g) == 'u')
			u++;	
	}
    HashMap<Character, Integer> vowels = new HashMap<Character, Integer>();
    vowels.put('a', a);
    vowels.put('b', e);
    vowels.put('c', i);
    vowels.put('d', o);
    vowels.put('e', u);
    return vowels;
 }
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Kindly type a sentence.");
	
	System.out.println(vowelCount(sc.nextLine()));
}
}
