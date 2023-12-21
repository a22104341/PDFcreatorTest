package com.johncena.pdfcreatortest.controller;

import com.johncena.pdfcreatortest.entity.Magic;
import com.johncena.pdfcreatortest.service.PdfGeneratorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PdfController {

    private final PdfGeneratorService pdfGeneratorService;

    public PdfController(PdfGeneratorService pdfGeneratorService) {
        this.pdfGeneratorService = pdfGeneratorService;
    }

    @GetMapping("/success")
    public String generatePdf(@ModelAttribute("magic") Magic magic, Model model) {
        System.out.println("\nReceived Magic object: " + magic.getNumberTest());   /* Sout to test magic text */

        String htmlContent = pdfGeneratorService.parseThymeleafTemplate(magic);
        pdfGeneratorService.generatePdfFromHtml(htmlContent);
        System.out.println("\nHTML Content: " + htmlContent);  /* sout to check html content */
        return "success";
    }
}
