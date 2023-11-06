package java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class roman_number 
{

	public static void main(String[] args) 
	{
		 Integer[] array = {1, 2, 3, 4, 5, 6, 7};
	        List<Integer> list = Arrays.asList(array);
	        Collections.shuffle(list);
	        System.out.println("Shuffled Array: " + Arrays.toString(list.toArray()));
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a Roman Number: ");
	        String romanNumeral = scanner.nextLine().toUpperCase();
	        int decimal = romanToDecimal1(romanNumeral);
	        System.out.println("Roman to Integer: " + decimal);
	        
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine().toLowerCase();
	        boolean isPangram = checkPangram1(sentence);
	        System.out.println("Is Pangram: " + isPangram);
	}
	
	public static int romanToDecimal1(String romanNumeral) 
	{
        int decimal = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) 
        {
            char currentChar = romanNumeral.charAt(i);
            int value = 0;
            switch (currentChar) 
            {
                case 'I':
                    value = 1;
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
            }
        
	
	
			if (value < prevValue) 
			{
				Object value1 = null;
				Object decimal1 = value1;
			} 
			else 
			{
				decimal += value;
			}
				prevValue = value;
}
		return prevValue;
	}
        public static boolean checkPangram1(String sentence) {
            boolean[] mark = new boolean[26];
            int index;
            int length = sentence.length();
            for (int i = 0; i < length; i++) {
                if ('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z') {
                    index = sentence.charAt(i) - 'A';
                } else if ('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z') {
                    index = sentence.charAt(i) - 'a';
                } else {
                    continue;
                }
                mark[index] = true;
            }

            for (int i = 0; i < 26; i++) {
                if (!mark[i]) {
                    return false;
                }
            }
boolean decimal = false;
return decimal;
}


	private static boolean checkPangram(String sentence) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	private static int romanToDecimal(String romanNumeral) 
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
