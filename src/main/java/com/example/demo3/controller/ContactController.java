package com.example.demo3.controller;

import com.example.demo3.model.ContactForm;
import com.example.demo3.service.ContactService;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.HashMap;


@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/contact")
    public String showContactForm(Model model) {

        ContactForm contactForm = contactService.getDefaultcontactForm();
        ArrayList<String> inquiryTypes = contactService.getInquiryTypes();
        HashMap<String, String> headerLinks = getHeaderLinks();

        model.addAttribute("contactForm", contactForm);
        model.addAttribute("inquiryTypes", inquiryTypes);
        model.addAttribute("headerLinks", headerLinks);

        return "contact";
    }

    public HashMap<String, String> getHeaderLinks() {
        HashMap<String, String> headerLinks = new HashMap<>();
        headerLinks.put("TOP", "/top");
        headerLinks.put("ABOUT","/about");
        headerLinks.put("CONTACT", "/contact");
        return headerLinks;
    }
}
