package com.example.demo3.service;

import com.example.demo3.model.ContactForm;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class ContactService {

    public ContactForm getDefaultcontactForm() {
        ContactForm contactForm = new ContactForm();
        contactForm.setName("田中 太郎");
        contactForm.setEmail("tanaka.taro@example.com");
        contactForm.setTel("000-000-0000");
        contactForm.setInquiry("〇〇〇の問い合わせ");
        return contactForm;
    }

    public ArrayList<String> getInquiryTypes() {
        ArrayList<String> inquiryTypes = new ArrayList<>();
        inquiryTypes.add("〇〇〇の問い合わせ");
        inquiryTypes.add("×××の問い合わせ");
        inquiryTypes.add("△△△の問い合わせ");
        return inquiryTypes;
    }
}

