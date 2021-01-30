package functionalities;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import javax.swing.JProgressBar;


public class TexttoPDF {

	
    public static void generatePdf(File source, File destination , JProgressBar progressbar) throws IOException  {
        //Initialize PDF writer
        if(source.getPath().endsWith(".txt")) {
            String dest = destination.getPath();
            String path = source.getPath();
            PdfWriter writer = new PdfWriter(dest);

            System.out.println(dest);
        
        //Initialize PDF document
            PdfDocument pdf = new PdfDocument(writer);
        
        // Initialize document
            Document document = new Document(pdf);
        
            Paragraph paragraph = new Paragraph();
		
            try {
            FileInputStream fstream = new FileInputStream(path);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            
            //br.
		// Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                
                progressbar.setValue(0x64);
		System.out.println(strLine);
		paragraph.add(strLine);
		paragraph.add("\n");
		paragraph.setVerticalAlignment(null);
            }
            in.close();
            } catch (Exception e) {// Catch exception if any
		System.err.println("Error: " + e.getMessage());
            }
		
        //Add paragraph to the document
            document.add(paragraph);

        //Close document
            document.close();
        }
	       
    }
}

