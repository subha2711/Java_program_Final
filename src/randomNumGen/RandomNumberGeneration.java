package randomNumGen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RandomNumberGeneration {

	public static void main(String[] args) {
		// For Each answer -- provide GitHub Link
		/*
		 * Practical 1: Generate 500 random numbers and print the nth smallest numbe r
		 * in a programming language of your choice. (Ask user for the Nth smallest
		 * number)
		 */
Random randomNum = new Random();
		
		Set<Integer>num=new LinkedHashSet<Integer>();
				
				while(num.size()!=500) {
					int a= 100 +randomNum.nextInt((1000-100)+1);
					//System.out.println(a);
					num.add(a);
					}
int smallestNum = Collections.min(num);
System.out.println("Nth smallest number is "+ smallestNum);
	}

}
