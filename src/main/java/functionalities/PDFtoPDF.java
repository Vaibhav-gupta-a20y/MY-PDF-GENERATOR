package functionalities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.utils.PdfMerger;
import java.util.ArrayList;

public class PDFtoPDF {

	
	public static void generatePdf(ArrayList<File> source , File destination ) throws IOException 
	{
		
			//source = FileArranger.arrangeFile(sequence, source);
			PdfDocument pdf;
			try {
				pdf = new PdfDocument(new PdfWriter(destination.getPath()));
				PdfMerger merger = new PdfMerger(pdf);
				
				//Add pages from the first document
				PdfDocument[] SourcePdf = new PdfDocument[source.size()];
				
				try {
					
					for(int i=0 ; i<source.size() ; i++) {
						SourcePdf[i] = new PdfDocument(new PdfReader(source.get(i)));
						
						
					    merger.merge(SourcePdf[i], 1 , SourcePdf[i].getNumberOfPages() );
					
						
					    SourcePdf[i].close();
					
					}
					pdf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw e;
					
				}
				
				
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw e;
				}
	}
}
