package functionalities;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


import org.apache.poi.xwpf.usermodel.XWPFDocument;

import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;

public class WordtoPDF {

	public static void generatePdf(File source, File destination) throws IOException {
		
		if(source.getPath().endsWith(".docx")) {
			FileInputStream docFile;
			try {
				docFile = new FileInputStream(new File(source.getPath()));
				XWPFDocument doc;
				doc = new XWPFDocument(docFile);
				PdfOptions option = PdfOptions.create();
				OutputStream out = new FileOutputStream(new File(destination.getPath()));
				PdfConverter.getInstance().convert(doc, out, option);
				doc.close();
				out.close();
				    
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
