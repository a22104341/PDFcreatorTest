package com.johnCena.PDFcreatorTest.controller;



import com.johnCena.PDFcreatorTest.entity.Magic;
import com.johnCena.PDFcreatorTest.mapper.Mapper;
import com.johnCena.PDFcreatorTest.service.MagicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/magic")
public class magicController {
    private final MagicService magicService;
    private final Mapper mapper;


    public magicController(MagicService magicService, Mapper mapper) {
        this.magicService = magicService;
        this.mapper = mapper;
    }

    @GetMapping("/home")
    public String showMagicForm(Model model) {
        Magic magic = new Magic();
        model.addAttribute("magic", magic);
        return "home";
    }


    @PostMapping("/home")
    public String processMagicForm(@ModelAttribute Magic magic) {
        // Process the form submission, e.g., save to the database
        magicService.saveMagic(magic);
        // Redirect to another page or return a success view
        return "redirect:/magic/success";
    }
}
