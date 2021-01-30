package functionalities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

//import com.itextpdf.html2pdf.HtmlConverter;

public class HTMLtoPDF {

	public static String HTML = null; /*"<h1>Hello</h1>"
			+ "<p>This was created using iText</p>"
			+ "<a href='hmkcode.com'>hmkcode.com</a>";*/
	
	
    public static void main( String[] args ) throws FileNotFoundException, IOException  
    {
    	
    	HTML = getURLSource("http://metazonetrainings.com/getloginPage#1");
    	

	   // HtmlConverter.convertToPdf( HTML, new FileOutputStream("D:/TrialPDF/Combo5.pdf"));
  	
        System.out.println( "PDF Created!" );
    }

	public static String getURLSource(String url) throws IOException
    {
        URL urlObject = new URL(url);
        URLConnection urlConnection = urlObject.openConnection();
        urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");

        return toString(urlConnection.getInputStream());
    }

    private static String toString(java.io.InputStream inputStream) throws IOException
    {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8")))
        {
            String inputLine;
            StringBuilder stringBuilder = new StringBuilder();
            while ((inputLine = bufferedReader.readLine()) != null)
            {
                stringBuilder.append(inputLine);
            }

            return stringBuilder.toString();
        }
    }
}
