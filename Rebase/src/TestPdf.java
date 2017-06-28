import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.xhtmlrenderer.pdf.ITextFontResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;

import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.BaseFont;

public class TestPdf {

	public static void main(String[] args) throws DocumentException, IOException {
		
		OutputStream os = new FileOutputStream("F:\\pdf.pdf");     
        ITextRenderer renderer = new ITextRenderer();     
        String url = new File("http://www.baidu.com").toURI().toURL().toString(); 

        renderer.setDocument("http://localhost:8080/console/report/pdf");

        // 解决中文支持问题     
        ITextFontResolver fontResolver = renderer.getFontResolver();    
        fontResolver.addFont("C:/Windows/Fonts/SIMSUN.TTC", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);     
        //解决图片的相对路径问题
        renderer.layout();    
        renderer.createPDF(os);  

        os.flush();
        os.close();
		
	}
	
}
