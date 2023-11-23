package com.info.demo;

import java.util.*;

public class demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String wordString = sc.next();
		
		int counter[] = new int[wordString.length()];
		char character[] = new char[wordString.length()];
		
		for(int i=0;i<character.length;i++)
		{
			int count = 0;
			for(int j=0;j<wordString.length();j++)
			{
				if(character[i]==wordString.charAt(j))
				{
					count++;
				}
				counter[i] = count;
			}
		}
		
		for(int i=0;i<character.length;i++)
		{
			System.out.println(character[i]+" - "+counter[i]);
		}
		

	}

}
