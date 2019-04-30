/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.pdf;


import Business.WorkQueue.WorkRegistration;
import Business.WorkQueue.refugeedetails;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfString;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;
import java.awt.image.BufferedImage;
//import com.itextpdf.kernel.pdf.PdfWriter;
//
//import com.itextpdf.layout.Document;
//import com.itextpdf.layout.element.Image;

 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class pdfgenerate {
    
     /** The resulting PDF. */
//     public static final String DEST = "results/pdfa/pdfua.pdf";
//    /** An image resource. */
//    public static final String FOX = "C:/Users/hp/Desktop/download.jpg";
//    /** An image resource. */
//    public static final String DOG = "C:/Users/hp/Desktop/dummy.png";
    /** A font that will be embedded. */
    public static final String FONT = "resources/fonts/FreeSans.ttf";
    
    private String DEST;
    private WorkRegistration wr;
    private refugeedetails rd;
    public static int i=0;
    public pdfgenerate(WorkRegistration wr) 
    {
        i++;
        this.wr=wr;
        this.deserialize();
        this.DEST="results/pdfa/"+this.wr.getRefugeeid().toString()+i+".pdf";
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        try
        {
            this.createPdf(DEST);
            JOptionPane.showMessageDialog(null,"Pdf Generated ");
        }catch(Exception e){
            System.out.println("error creating pdf");
        }
        
        
    }
    
//    static public void main(String args[]) throws IOException, DocumentException {
//        File file = new File(DEST);
//        file.getParentFile().mkdirs();
//        new pdfgenerate().createPdf(DEST);
//    }
    
    
    public void createPdf(String dest) throws IOException, DocumentException {
        Document document = new Document(PageSize.A4.rotate());
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(dest));
        writer.setPdfVersion(PdfWriter.VERSION_1_7);
        //TAGGED PDF
        //Make document tagged
        writer.setTagged();
        //===============
        //PDF/UA
        //Set document metadata
        writer.setViewerPreferences(PdfWriter.DisplayDocTitle);
        document.addLanguage("en-US");
        document.addTitle("English pangram");
        writer.createXmpMetadata();
        //=====================
        document.open();
 
        Paragraph p = new Paragraph();
        //PDF/UA
        //Embed font
        Font font = FontFactory.getFont(FONT, BaseFont.WINANSI, BaseFont.EMBEDDED, 20);
        Font fonth = FontFactory.getFont(FONT, BaseFont.WINANSI, BaseFont.EMBEDDED, 24);
        fonth.setColor(BaseColor.BLUE);
        p.setFont(fonth);
        //==================
        Chunk c = new Chunk("Refugee Details");
        p.add(c);
        
        
        Image i = Image.getInstance(new File("Image\\"+wr.getImage_path()).getAbsolutePath());
        i.scaleAbsolute(150, 150);
        i.setAlignment(Image.ALIGN_RIGHT);
        document.add(p);
        i.setAbsolutePosition(500, 300);
        document.add(i);
       

        p = new Paragraph("\n"); p.setFont(font);c = new Chunk("Refugee Id          :"); p.add(c); c = new Chunk(this.wr.getRefugeeid().toString()); p.add(c); document.add(p);
        p = new Paragraph("\n"); p.setFont(font);c = new Chunk("Name                  :"); p.add(c); c = new Chunk(this.rd.getName()); p.add(c); document.add(p);
        p = new Paragraph("\n"); p.setFont(font);c = new Chunk("Age                     :"); p.add(c); c = new Chunk(String.valueOf(this.rd.getAge())); p.add(c);document.add(p);
        p = new Paragraph("\n"); p.setFont(font);c = new Chunk("Gender               :"); p.add(c); c = new Chunk(this.rd.getGender()); p.add(c);document.add(p);
        p = new Paragraph("\n"); p.setFont(font);c = new Chunk("Father's Name    :"); p.add(c); c = new Chunk(this.rd.getFathername()); p.add(c);document.add(p);
        p = new Paragraph("\n"); p.setFont(font);c = new Chunk("Mother's Name   :"); p.add(c); c = new Chunk(this.rd.getMothername()); p.add(c);document.add(p);
        p = new Paragraph("\n"); p.setFont(font);c = new Chunk("No of Children    :"); p.add(c); c = new Chunk(String.valueOf(this.rd.getChildno())); p.add(c);document.add(p);
 
        p = new Paragraph("\n\n\n\n\n\n\n\n\n\n\n\n", font);
        document.add(p);
       
        document.close();
    }
    
    public void deserialize()
    {
        
      try {
         FileInputStream fileIn = new FileInputStream("Rfiles/"+this.wr.getFilename());
         ObjectInputStream in = new ObjectInputStream(fileIn);
         this.rd = (refugeedetails) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("refugee class not found");
         c.printStackTrace();
         return;
      }
    }
    
}
