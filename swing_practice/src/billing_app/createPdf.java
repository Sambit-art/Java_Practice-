package billing_app;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class createPdf {

	public void createPdf(Object[] objects) {
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream("bill.pdf"));
			document.open();
			Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
			document.add(new Paragraph("Welcome To   'Teste It'"));
			document.add(new Paragraph("Contact- +91 94xxxxxxxx"));
			document.add(new Paragraph("---------------------------"));
			for(Object line:objects) {
				document.add( new Paragraph( line.toString() ) );

			}
			document.add(new Paragraph("Thank You,Visit Again"));
		} catch (Exception e) {
			e.printStackTrace();
		} 

		

		
		document.close();

	}

}
