package com.example.demo3.controller;

import com.example.demo3.model.ContactForm;
import com.example.demo3.service.ContactService;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;


@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/contact")
    public String showContactForm(Model model) {

        ContactForm contactForm = contactService.getDefaultcontactForm();
        ArrayList<String> inquiryTypes = contactService.getInquiryTypes();
        ArrayList<String> headerLinks = getHeaderLinks();

        model.addAttribute("contactForm", contactForm);
        model.addAttribute("inquiryTypes", inquiryTypes);
        model.addAttribute("headerLinks", headerLinks);

        return "contact";
    }

    public ArrayList<String> getHeaderLinks() {
        ArrayList<String> headerLinks = new ArrayList<>();
        headerLinks.add("TOP");
        headerLinks.add("ABOUT");
        headerLinks.add("CONTACT");
        return headerLinks;
    }
}
