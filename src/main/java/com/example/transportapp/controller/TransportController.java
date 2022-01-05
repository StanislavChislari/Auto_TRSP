package com.example.transportapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.transportapp.domain.Transport;
import com.example.transportapp.service.TransportService;

@Controller
public class TransportController {
    @Autowired
    private TransportService service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Transport> listtransport = service.listAll();
        model.addAttribute("listtransport", listtransport);
        System.out.print("Get / ");
        return "index";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveTransport(@ModelAttribute("transport") Transport transport) {
        service.save(transport);
        return "redirect:/";
    }
}
