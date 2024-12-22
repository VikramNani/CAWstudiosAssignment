package allProgs;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import org.testng.annotations.Test;

public class OnlinePractice {

	@Test
	void fibonacciSeries()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Range");
		int Range=s.nextInt();
		int a=0,b=1,c;
		System.out.println(a+"\n"+b);
		for(int i=1;i<=Range;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	
	@Test
	void checkPrimeOrNot()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Num");
		int num=s.nextInt();
		int count=0;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
		
	}
	
	@Test
	void checkRangePrime()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Range");
		int num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
			int count=0;
			for(int j=2;j<=num;j++)
			if(i%j==0)
			{
				count++;
			}
			if(count==1)
			{
				System.out.println(i);
			}
		}
	}
	
	@Test
	void stringPalindrome()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Range");
		String str=s.next();
		String p="";
		for(int i=str.length()-1;i>=0;i--)
		{
		   p+=str.charAt(i);
		}
		if(str.equalsIgnoreCase(p))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
	
	@Test
	void integerPalindrome()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Range");
		int num=s.nextInt();
		int temp=num,rev=0,rem=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		if(rev==temp)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
	
	@Test
	void armstrong()
	{
		int num=153,rem,arm=0,temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			arm=arm+rem*rem*rem;
		}
		if(arm==temp)
		{
			System.out.println(arm);
		}
	}
	
	@Test
	void rangeArmstrongNums()
	{
		for(int i=1;i<=1000;i++)
		{
			int num=i,rem,arm=0,temp=i;
			while(num>0)
			{
				rem=num%10;
				num=num/10;
				arm=arm+rem*rem*rem;
			}
			if(arm==temp)
			{
				System.out.println("Arm="+arm);
			}
		}
	}
	
	@Test
	void factorial()
	{
		int num=5,fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	@Test
	void reverseString()
	{
		//Reverse using string builder
		
//		String s="Hello World";
//		StringBuilder sb = new StringBuilder(s);
//		StringBuilder rev = sb.reverse();
//		System.out.println(rev);
		
		//Reverse using for loop
		
		String s="Hello World";
		String output = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			output+=s.charAt(i);
		}
		System.out.println(output.toCharArray());
	}
	
	@Test
	void deleteDupChars()
	{
		Character[] c = {'a', 'b', 'c', 'a', 'd', 'b'};
		Set<Character> set = new LinkedHashSet<>();
		for(int i=0;i<c.length;i++)
		{
			 set.add(c[i]);
		}
		System.out.println(set);
	}

	@Test
	void deleteDupIntegers()
	{
		Integer[] num = {1, 2, 3, 3, 4, 5, 5, 6};
		Set<Integer> set = new LinkedHashSet<>();
		for(int i=0;i<num.length;i++)
		{
			set.add(num[i]);
		}
		System.out.println(set);
	}
	
	@Test
	void deleteString()
	{
		String[] str = {"apple", "banana", "apple", "orange", "banana"};
		Set<String> set = new LinkedHashSet<>();
		for(String s : str)
		{
			set.add(s);
		}
		System.out.println(set);
	}
	
	@Test
	void countRepeatChars()
	{
		String input = "programming";
//		char[] ch = input.toCharArray(); // have to uncomment this if we use foreach loop
		Map<Character, Integer> m = new LinkedHashMap<>();
		
		//Using Foreach loop
//		for(Character c : ch)
//		{
//			m.put(c, m.getOrDefault(c,0)+1);
//		}
		
		//Using for loop
		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			m.put(ch, m.getOrDefault(ch, 0)+1);
		}
		System.out.println(m);
	}
	
	@Test
	void count()
	{
		String[] str = {"apple", "banana", "apple", "orange", "banana"};
		Set<String> st=new LinkedHashSet<>();
		for(String s : str)
		{
			st.add(s);
		}
		System.out.println(st);
	}
	
}
