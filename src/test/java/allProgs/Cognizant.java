package allProgs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Cognizant {

	@Test
	void leapYear()
	{
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
        {
            System.out.println(year + " is a Leap Year.");
        } 
        else 
        {
            System.out.println(year + " is not a Leap Year.");
        }
	}
	
	
	@Test
	public void dup()
	   {
		String s = "TheFaallofUsherr";
        String dup = s.toLowerCase();

        // Using a HashMap to store character counts
        HashMap<Character, Integer> hm = new HashMap<>();

        // Iterate through the string and count each character
        for (int i = 0; i < dup.length(); i++) {
            char c = dup.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        System.out.println(hm);
	}
	
	@Test
	void leap()
	{
		String s = "TheFaallofUsherr";
		char[] ch = s.toLowerCase().toCharArray();
		Map<Character, Integer> count = new LinkedHashMap<>();
		for(Character c : ch)
		{
			count.put(c, count.getOrDefault(c,0)+1);
		}
		System.out.println(count);
	}
	
}
