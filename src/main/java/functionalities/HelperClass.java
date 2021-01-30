package functionalities;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;




public class HelperClass {

	private static Scanner input; 
    
   
    
    public static File getPath(int choice) {
    	
    	
    	JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(choice);
        int returnValue = fileChooser.showOpenDialog(null);
        
        File selectedFile = null;
        if (returnValue == JFileChooser.APPROVE_OPTION) 
        {
            selectedFile = fileChooser.getSelectedFile();
           
        }
        
    	return selectedFile;
    }
    
    @SuppressWarnings({ "static-access", "static-access" })
	public static void main(String[]args) throws IOException {
    	
    	File sourceFile1 = null;
    	
    	String extension = null;
		
    	File destFile = null;
    	
    	int length = 0;
    	File[] files = null;
    	
    	System.out.println("Enter \n1 for Text to Pdf\n2 for HTML to PDF\n3 for Word to PDF\n4 for Image to PDF\n5 for PDF to PDF");
    	
    	input = new Scanner(System.in);
    	System.out.print(" Choice = ");
    	int choice = input.nextInt();
    	System.out.print(choice);
    	int num = 1;
    	
    	while(choice >= 4 && num<2) {
    		
    		System.out.print("Please enter correct numbers of files = ");
			num = input.nextInt();
    	}
    	//sourceFile1 = getPath(JFileChooser.FILES_ONLY);
    	files = insertFile(num);
		destFile = getPath(JFileChooser.DIRECTORIES_ONLY);
			
		System.out.print("Enter name of file : ");
		extension = input.next();
		
		System.out.println(destFile.getPath() + File.separator + extension);
		destFile = new File(destFile.getPath() + File.separator + extension + ".pdf");
    	
    	switch (choice) {
		case 1:
			
			//TexttoPDF.generatePdf(files[0], destFile );
			break;
			
		case 2:
			
			HTMLtoPDF.main(null); // Correction accept url and destination
			break;
			
		case 3:
			
			WordtoPDF.generatePdf(files[0], destFile );
			break;
			
		case 4:
			
			//ImagetoPDF.generatePdf(FileArranger.arrangeFile(getSequence(files), files) , destFile );
			break;
			
		case 5:
			
			//PDFtoPDF.generatePdf(FileArranger.arrangeFile(getSequence(files), files) , destFile );
			break;

		default:
			break;
		}
    	
    }  
    public static File[] insertFile(int num ) {
    	File[] files = null;
    	files = new File[num];
		
		for(int i=0 ; i<num ; i++) {
			files[i] = getPath(JFileChooser.FILES_ONLY);
			
		}
		return files;
    }
    
    public static int[] getSequence(File[] files) {
    	
    	int[] sequence = new int[files.length];
    	for(int i=0 ; i<files.length ; i++) {
			System.out.println((i+1) + ") " + files[i].getName());
    	}
    	
    	System.out.print("Do you ant to sort Y/N? = ");
    	String choice = input.next();
    	if(choice.toLowerCase().equals("y") ) {
    		System.out.println(" Enter sequence in which you want to merge :-");
    		
    		for(int i=0 ; i<files.length ; i++) {
    			sequence[i] = input.nextInt();
    		}
    	}
		return sequence;
    }
}
