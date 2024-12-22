package allProgs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Publisis {

	@Test
	void delDup()
	{
		//1st Method
		
//		Integer i[] = {1,2,1,2};
//		Arrays.sort(i);
//		String z = Arrays.toString(i);
//		System.out.println(Arrays.toString(i)); //Sorting
//		Set<Integer> n = new LinkedHashSet<>();
//		for(int a : i)
//		{
//		   n.add(a);
//		}
//		System.out.println(n);
		
		//2nd Method
		
//		Integer[] i = {1, 2, 1, 2};
//
//        // Using TreeSet to sort and remove duplicates
//        Set<Integer> ts = new TreeSet<>(Arrays.asList(i));
//
//        System.out.println("After Sorting and Removing Duplicates: " + ts);
		
	}
	
	@Test
	void a1b2c3d4()          //Input a1b2c3d4, Output d4c3b2a1
	{
		//1st Format
		
		String input = "a1b2c3d4";
        String output = "";

        // Loop through the input string from the end to the beginning
        for (int i = input.length() - 2; i >= 0; i -= 2) {
            output += input.charAt(i);     // Add character (letter)
            output += input.charAt(i + 1); // Add character (digit)
        }

        System.out.println("Output: " + output);
        
        // 2nd Format
        
//        String input = "a1b2c3d4";
//        StringBuilder output = new StringBuilder();
//
//        // Loop from the end of the input, appending character pairs to output
//        for (int i = input.length() - 2; i >= 0; i -= 2) {
//            output.append(input.charAt(i)).append(input.charAt(i + 1));
//        }
//
//        System.out.println("Output: " + output);
//        
//        //Just reverse entire String
//        
//		String a = "a1b2c3d4";
//		StringBuilder sb = new StringBuilder(a).reverse();
//		System.out.println(sb);
	}
	
	@Test
	void wordCount()
	{
		String a = "{abc, abc, def, def, abc}";
		String[] b = a.replaceAll("[{}]", "").split(", ");
		Map<String, Integer> m = new HashMap<>();
		for(String count : b)
		{
			m.put(count, m.getOrDefault(count, 0)+1);
		}
		System.out.println(m);
	}
	
	@Test
	void all()
	{
		String a = "{abc, abc, def, def, abc}";
		String[] b = a.replaceAll("[{}]","").split(", ");
		LinkedHashMap<String, Integer> m = new LinkedHashMap<>();
		for(String words : b)
		{
			m.put(words, m.getOrDefault(words, 0)+1);
		}
		System.out.println(m);
		
		//Another
		
		String input = "a1b2c3d4";
		String output = "";
		for(int i=input.length()-2;i>=0;i-=2)
		{
			output += input.charAt(i);
			output += input.charAt(i+1);
		}
		System.out.println(output);
		
		//Another
		
		Integer v[] = {1,2,1,2};
		
		Set<Integer> s = new LinkedHashSet<>();
		
		for(Integer g : v)
		{
			s.add(g);
		}
		System.out.println(s);
		
	}
	
	@Test
	void arm()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = s.nextInt();
		
		int rem,arm=0,temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			arm=arm+rem*rem*rem;
		}
		if(arm==temp)
		{
			System.out.println("Arm ="+arm);
		}
		
	}
	
	@Test
	void reverse()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = s.nextInt();
		
		int rem,rev=0,temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
			System.out.println("Rev ="+rev);
		
	}
	
	@Test
	void palindrome()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = s.nextInt();
		
		int rem,rev=0,temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		if(rev==temp)
		{
			System.out.println("Palindrome ="+rev);
		}
		
	}
	
	@Test
	void del() 
	{
		Integer[]a= {1,2,3,1,2};
		
		Set<Integer> s=new LinkedHashSet<>();
		for(Integer d:a)
		{
			s.add(d);
		}
		System.out.println(s);
	}
	
	@Test
	void string()
	{
		String a = "{abc, abc, def, def, abc}";
		String[] w = a.replaceAll("[{}]", "").split(", ");
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		for(String words:w)
		{
			m.put(words, m.getOrDefault(words, 0)+1);
		}
		System.out.println(m);
	}
	
	@Test
    void replace()
    {
		String input = "a1b2c3d4";
		String output="";
		for(int i=input.length()-2;i>=0;i-=2)
		{
			output+=input.charAt(i);
			output+=input.charAt(i+1);
		}
		System.out.println(output);
    }
	
	//Value Momentum Interview
	@Test
	void reee()
	{
		String a = "you Are! Genious Boy?";
        String[] w = a.split(" ");
        String output="";
        for(int i=w.length-1;i>=0;i--)
        {
        	output+=w[i];
        	if(i>0)
        	{
        		output+=" ";
        	}
        }
        System.out.println(output);
	}
	
	
	@Test
	void num()
	{
        for (int i = 200; i >= 0; i--) {

            if (i == 79) {
                System.out.println(" ");
            } else {
                System.out.println(i);
            }
        }
	}
	
	
}
