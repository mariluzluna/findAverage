package average;
import java.io.*;
import java.util.*;

public class average {
	public static void main(String [] args) throws Exception {
		Scanner scanner = new Scanner(new File("numbers.text"));

		while (scanner.hasNextInt()) {
			int howMany = scanner.nextInt();

			int [] arr = new int[howMany];

			for (int i = 0; i < howMany; i++)
				arr[i] = scanner.nextInt();

			System.out.println("avg: " + average(arr));
		}
	}
				
	static double average(int [] arr) {
		if (arr.length == 0) return null;
		double total = 0;
		for (int i = 0; i < arr.length; i++) 
			total += arr[i];

		return (double)total / arr.length;
	}
	static Result average (int[]arr) {
		if (arr.length == 0) return null;
		double total = 0;
		for (int i = 0; i < arr.length; i++) 
			total += arr[i];

		return (double)total / arr.length;
	}
	}
}

