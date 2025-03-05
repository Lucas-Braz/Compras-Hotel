package com.compras.hoteis.service;

import com.compras.hoteis.model.M_Hotel;
import com.compras.hoteis.repository.R_Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class S_Hotel {
    @Autowired
    private R_Hotel r_hotel;

    public List<M_Hotel> getHoteis(){
        return r_hotel.findAll();
    }
}
