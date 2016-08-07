/** Program:  12.19
  * File:     CountWords.java 
  * Summary:  Chapter 12, Exercise 19, Write a program that counts the number of words in President     *
* 		Abraham Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/  *
* 		Lincoln.txt.
  * Author:   Eric Roberts
  * Date:     August 5, 2016
**/
import java.util.Scanner;

public class CountWords {
	
	public static void main(String[] args) {
		try {
			//create a URL object
			java.net.URL url = new java.net.URL(
				"http://cs.armstrong.edu/liang/data/Lincoln.txt");

			int count = 0; //counts words

			//open an input stream and create a Scanner object
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				//read words
				if (Character.isLetter((input.next()).charAt(0))) {
					count++;
				}
			}

			//display result
			System.out.println(
				"Number of words in President Abraham Lincoln's Gettysburg address: " +
				count);
		}
		catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		}
		catch (java.io.IOException ex) {
			System.out.println("I/0 Errors: no such file");
		}
	}
}

