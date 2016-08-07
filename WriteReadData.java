/** Program:  12.15
  * File:     WriteReadData.java 
  * Summary:  Chapter 12, Exercise 15, Write a program to create a file named Exercise12_15.txt if  *
* it does not exist. Write 100 integers created randomly into the file using     *
* text I/O. Integers are separated by spaces in the file. Read the data back     *
* from the file and display the data in increasing order.
  * Author:   Eric Roberts
  * Date:     August 5, 2016
**/
import java.util.*;
import java.io.*;

public class WriteReadData {
	
	public static void main(String[] args) throws Exception {
		//check if file exists
		File file = new File("Exercise12_15.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}

		try (
			//create output file
			PrintWriter output = new PrintWriter(file);
		) {
			//write 100 integers created randomly to file
			for (int i = 0; i < 100; i++) {
				output.print(((int)(Math.random() * 500) + 1));
				output.print(" ");
			}
		}

		//create an ArrayList
		ArrayList<Integer> list = new ArrayList<>();

		try(
			//create input file
			Scanner input = new Scanner(file);
		) {
			//read the data back from the file
			while (input.hasNext()) {
				list.add(input.nextInt());
			}
		}

		//sort array list
		Collections.sort(list);

		//print data in increasing order
		System.out.print(list.toString());
		System.out.println();
	}
}




