package sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Sample {

	@Test
	void checkingAllLeapYearsUpToGivenRange()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter year");
		int year = s.nextInt();
		for(int i=1;i<=year;i++)
		{
			if((i%4==0 && i%100!=0) || (i%400==0))
			{
				System.out.println(i);
			}
		}
	}
	
	@Test
	void leapCheck()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter year");
		int year = s.nextInt();
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}
	
	// Count with converting to lower case
	@Test
	void countDupLetters()
	{
		String s = "TheFaallofUsherr";
		String dup = s.toLowerCase();
		HashMap<Character, Integer> hm = new LinkedHashMap<>();
		
		for(char c : dup.toCharArray())
		{
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		System.out.println(hm);
		
//		for(HashMap.Entry<Character,Integer> v : hm.entrySet())
//		{
//			System.out.println(v.getKey()+":"+v.getValue());
//		}
		
		
		
		
		// This also fine
		
//		for(int i=0;i<s.length();i++)
//		{
//			char c=dup.charAt(i);
//			hm.put(c, hm.getOrDefault(c, 0)+1);
//		}
		
		
	}
	
	// Count without converting to lower case
	@Test
	void count()
	{
		String s = "TheFaallofUsherr";
		HashMap<Character, Integer> hm = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		System.out.println(hm);
	}
	
	// Arrays Sorting
	@Test
	void intJustSorting()
	{
		int[] a = {5, 2, 8, 1, 4};
		Arrays.sort(a);
		for(int b:a)
		{
			System.out.println(b);
		}	
	}
	
	@Test
	void intSortWithIndex()
	{
		int[] a = {5, 2, 8, 4, 1};
		Arrays.sort(a, 0,a.length);
		for(int b:a)
		{
			System.out.println(b);
		}	
	}
	
	@Test
	void stringSort()
	{
		String[] fruits = {"Banana", "Apple", "Cherry", "Mango"};
		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));
		
//		for(String word:fruits)
//		{
//			System.out.println(word);
//		}
	}
	
	
	
	
}
