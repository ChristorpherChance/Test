package com;

import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class FirstConsoleProgram extends ConsoleProgram
{
	public void run()
	{
//		println("Please input your parameters:");
//		int n1 = readInt("Enter n1= ");
//		int n2 = readInt("Enter n2= ");
//		int sum = n1 + n2;
//		println("The total is "+ sum);
		
		
		String line = readLine();
		StringTokenizer stringTokenizer = new StringTokenizer(line);
		for(int i=0;stringTokenizer.hasMoreTokens();i++)
		{
			System.out.println("Token"+i+": "+stringTokenizer.nextToken());
		}
		
	}
}
