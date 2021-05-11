package laba4;

import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

public class PDF implements ActionListener {
	
	@Override 
	public void actionPerformed(ActionEvent arg0) { 
		Document document = new Document(); 
		try {
			PdfWriter.getInstance(document, new FileOutputStream("Check.pdf"));
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}
			
		document.open(); 
		
		BaseFont times = null;
		try {
			times = BaseFont.createFont("/fonts/times.ttf", "cp1251", BaseFont.EMBEDDED);
		} catch (DocumentException | IOException e) {
			e.printStackTrace();
		}
		
		String string_pdf = "Категория:";
		Paragraph paragraph = new Paragraph();
	    paragraph.add(new Paragraph(string_pdf, new Font(times,14)));
	    
	    String string_pdf2 = "Регион:";
	    paragraph.add(new Paragraph(string_pdf2, new Font(times,14)));
	
	    String string_pdf3 = "КБМ водителя:";
	    paragraph.add(new Paragraph(string_pdf3, new Font(times,14)));
	
	    String string_pdf4 = "Возраст:";
	    paragraph.add(new Paragraph(string_pdf4, new Font(times,14)));
	
	    String string_pdf5 = "Стаж (лет)";
	    paragraph.add(new Paragraph(string_pdf5, new Font(times,14)));
	
	    String string_pdf6 = "Мощность (л.с.)";
	    paragraph.add(new Paragraph(string_pdf6, new Font(times,14)));
	
	    String string_pdf7 = "Наличие прицепа";
	    paragraph.add(new Paragraph(string_pdf7, new Font(times,14)));
	
	    String string_pdf8 = "Промокод:";
	    paragraph.add(new Paragraph(string_pdf8, new Font(times,14)));
	
	    String string_pdf9 = "Стоимость (руб.):";
	    paragraph.add(new Paragraph(string_pdf9, new Font(times,14)));
	
	    try {
			document.add(paragraph);
		} catch (DocumentException e1) {
			e1.printStackTrace();
		}
		document.close(); 
		
	}
	
}

