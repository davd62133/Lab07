/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.services.impl;

import com.mercado.mongodb.SerieRepository;
import com.mercado.services.MercadoService;
import com.model.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2123162
 */
@Service
public class PersistAlphaVantage implements MercadoService{
    @Autowired
    private SerieRepository repository;
    
    private AlphaVantage alpha = new AlphaVantage();

    @Override
    public String timeSeriesIntradat() {
        System.out.println(repository.findByCategory("Intradat"));
        Serie temp = repository.findByCategory("Intradat");
        if(temp == null){            
            repository.save(new Serie("Intradat", alpha.timeSeriesIntradat()));
        }
        return repository.findByCategory("Intradat").info;
    }

    @Override
    public String timeSeriesDaily() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String timeSeriesWeekly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String timeSeriesMonthly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
