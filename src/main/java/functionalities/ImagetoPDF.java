package functionalities;

import java.io.File;
import java.io.FileNotFoundException;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;

public class ImagetoPDF {

	public static List generatePdf(ArrayList<File> sources ,File destination ) throws MalformedURLException, FileNotFoundException {
		
		List<File> invalidFiles = new ArrayList<File>();
		//File[] sources = FileArranger.arrangeFile(sequence, source);
		String dest = destination.getPath() ;    // "D:/TrialPDF/AAA.pdf"
		
		PdfWriter writer;
       
		writer = new PdfWriter(dest);
		PdfDocument pdfDoc = new PdfDocument(writer); 
		Document document = new Document(pdfDoc , PageSize.A4);

		
		for(int i=0 ; i<sources.size() ; i++) {
			
			if(sources.get(i).getPath().toLowerCase().endsWith(".jpg") || sources.get(i).getPath().toLowerCase().endsWith(".jpeg") || sources.get(i).getPath().toLowerCase().endsWith(".png")) {
				
						
		            ImageData data;
					try {
						data = ImageDataFactory.create(sources.get(i).getPath());
						Image img = new Image(data);
						System.out.println(img.getImageHeight());//768
						System.out.println(img.getImageWidth());//1024
						 
						img.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight());
						
				        //img.setFixedPosition(1, 2, 5);//(1.1, 2.1, 5);
				        document.add(img); 
				        
				     
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						throw e;
					} 
			}
			else {
				System.out.println("Invalid File type");
				System.out.println(" File number =" + i + " File name = " + sources.get(i).getName());
				invalidFiles.add(sources.get(i));
			}
		}
		document.close();
		return invalidFiles;
	}
}
