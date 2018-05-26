/*
Kevin Nguyen
Basic Java programs that outputs n choose k combinations given an array.

How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "javac *.java" to compile java files
	3.) type in "java JavaComboNK"
*/

//imports
import java.io.*;
import java.util.*;

//class
class JavaComboNK {
	//Global Declarations

	//main driver
	public static void main(String[] args) {
		//local Declarations
		String[] arr = {"A", "B", "C", "D"};
		int k = 2, startPos = 0;
		doCombo(arr, k, startPos, new String[2]);
	}

	//function definitions below	
	public static void doCombo(String[] arr, int len, int startPos, String[] result) {
		//local declarations
		int i = startPos, size = arr.length-len, insertIndex = result.length-len, newLength = len-1;

		//recusion: Base and Recursive cases
		if(len == 0) {
			System.out.println(Arrays.toString(result));
		}
		else {
			//loop through all applicable elements in the array
			while(i <= size) {
				result[insertIndex] = arr[i];
				doCombo(arr, newLength, i+1, result); //recursive call to form next item in new result
				i++;
			}
		}
	}
}