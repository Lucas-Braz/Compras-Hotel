package com.compras.hoteis.controller;

import com.compras.hoteis.service.S_Hotel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Hotel {
    private final S_Hotel s_hotel;

    public C_Hotel(S_Hotel s_hotel) {
        this.s_hotel = s_hotel;
    }

    @GetMapping("/")
    public String getHome(){
        return "index";
    }

    @PostMapping("/")
    public String postHome(@RequestParam("data") String data,
                           Model model){
        model.addAttribute("hoteis",s_hotel.getHoteis());
        return null;
    }
}
