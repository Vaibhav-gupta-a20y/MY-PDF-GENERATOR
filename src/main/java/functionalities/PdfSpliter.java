package functionalities;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.utils.PdfMerger;

public class PdfSpliter {

	//public static final String dest = "D:/TrialPDF/SplitTry1.pdf";

	//static File selectedFile = null;
	
	public static void generatePdf(File source, File destination, String[] pages ) throws IOException
	{
		if(source.getPath().endsWith(".pdf")) {
			
			String dest = destination.getPath() ;
			
			/*Scanner input = new Scanner(System.in);
			
			System.out.println(source.getPath());
			
			System.out.print("Entre number of parts : -");*/
			int parts = pages.length;
			
			int[][] arr = new int[parts][2];
			
			for(int i=0 ; i<parts ; i++) {
                            
                            if(pages[i].contains("-")){
                                arr[i][0] = Integer.parseInt(pages[i].substring(0, pages[i].indexOf("-")));
				
                                System.out.print(" End = ");
                                arr[i][1] = Integer.parseInt(pages[i].substring( pages[i].indexOf("-")+1 , pages[i].length()));
                                //arr[i][1] = Character.getNumericValue(pages[i].charAt(2));
                            }
                            else{
                                arr[i][0] = Integer.parseInt(pages[i].substring(0, pages[i].length()));//Character.getNumericValue(pages[i].charAt(0));

                                
                                arr[i][1] = Integer.parseInt(pages[i].substring(0, pages[i].length()));//Character.getNumericValue(pages[i].charAt(0));
                            }
			}
			
			
			PdfDocument pdf;
			try {
				pdf = new PdfDocument(new PdfWriter(dest));
				PdfMerger merger = new PdfMerger(pdf);
				
				//Add pages from the first document
				PdfDocument SourcePdf;
				System.out.println(source.getPath());
					
				SourcePdf = new PdfDocument(new PdfReader(source));
				
				for(int i=0 ; i<parts ; i++) {
				
					merger.merge(SourcePdf, arr[i][0] , arr[i][1]);//1, firstSourcePdf.getNumberOfPages());
					
				}
				SourcePdf.close();
				pdf.close();
				
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw e;
				}
		}
		else {
			System.out.println("Invalid File type");
		}
	}
}
			

		