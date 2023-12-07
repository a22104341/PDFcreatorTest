package com.johnCena.PDFcreatorTest.controller;

import com.johnCena.PDFcreatorTest.entity.Magic;
import com.johnCena.PDFcreatorTest.service.PdfGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PdfController {

    private final PdfGenerator pdfGenerator;

    public PdfController(PdfGenerator pdfGenerator) {
        this.pdfGenerator = pdfGenerator;
    }

    @GetMapping("/success")
    public String generatePdf(@ModelAttribute("magic") Magic magic, Model model) {
        String htmlContent = pdfGenerator.parseThymeleafTemplate(magic);
        pdfGenerator.generatePdfFromHtml(htmlContent);
        return "success";
    }
}
