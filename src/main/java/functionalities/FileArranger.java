package functionalities;

import java.io.File;
import java.util.Scanner;

public class FileArranger {
	public static File[] arrangeFile(int[] arr , File[] files) {
		// TODO Auto-generated method stub
		File[] finalFile = new File[files.length];
		for(int i=0 ; i<files.length ; i++) {
			
			finalFile[i] = files[arr[i] - 1];
		 
		}
		return finalFile;
	}


	/*public static void arraneFile(int[] arr , File[] files) {
		// TODO Auto-generated method stub
		File file;
		for(int i=0 ; i<files.length ; i++) {
			
			file = files[0];
		    files[arr[i] - 1] = files[0];
			files[arr[i] - 1] = file;
		}
		int i=0;
		while(i<files.length) {
			file = files[i];
		    files[arr[i] - 1] = files[i];
			files[arr[i] - 1] = file;
			if((arr[i] - 1) == i) {
				i++;
			}
		}

	}*/
}	
	/*public static void main(String[] files) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print(" Size = ");
		int size = input.nextInt();
		int[] ar = new int[size];
		for(int i=0 ; i<size ; i++) {
			
			ar[i] = input.nextInt();
		}
		for(int i=0 ; i<size ; i++) {
			
			int j ;
			j = ar[0];
			ar[]
		}
	}

}*/


// 3 4 2 1
/*
	1 2 3 4
	2 4 3 1
	4 2 3 1
	1 2 3 4
	
*/

// 3 1 4 2
/*
	4 1 3 2
	2 1 3 4
	1 2 3 4
*/

// 1 3 4 2
/*
 	1 4 3 2
 	1 2 3 4
*/