package com.samples.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class testLinkedHashSet
{
	//Both HashSet and LinkedHashSet provides uniqueness
	//insertion order
	public static void main(String[] args) 
	{
		Set<String> s=new HashSet<String>();
		s.add("Sneha");
		s.add("Aishi");
		s.add("Nisha");
		s.add("Priyanka");
		System.out.println(s);
		
		Set<String> s1=new LinkedHashSet<String>();
		s1.add("Sneha");
		s1.add("Aishi");
		s1.add("Nisha");
		s1.add("Priyanka");
		System.out.println(s1);
		
		
		
	}

}
