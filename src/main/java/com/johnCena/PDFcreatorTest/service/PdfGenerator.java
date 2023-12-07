package com.johnCena.PDFcreatorTest.service;

import com.johnCena.PDFcreatorTest.entity.Magic;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

@Service
public class PdfGenerator {

    public String parseThymeleafTemplate(Magic magic) {
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);

        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);

        Context context = new Context();
        context.setVariable("to", "This is an interesting test my boy");
        context.setVariable("magic", magic);

        return templateEngine.process("templates/pdfGenerator", context);
    }

    public void generatePdfFromHtml(String html) {
        try {
            String outputFolder = "C:\\Users\\VyzeOP\\Desktop\\TFC\\LearnSpring\\PDFcreatorTest\\createdPDFs" + File.separator + "thymeleaf.pdf";
            OutputStream outputStream = new FileOutputStream(outputFolder);

            ITextRenderer renderer = new ITextRenderer();
            renderer.setDocumentFromString(html);
            renderer.layout();
            renderer.createPDF(outputStream);

            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error generating PDF from HTML", e);
        }
    }
}
