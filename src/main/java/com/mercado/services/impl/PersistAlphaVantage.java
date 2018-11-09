/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.services.impl;

import com.mercado.mongodb.SerieRepository;
import com.mercado.services.MercadoService;
import com.model.Serie;
import java.util.Date;
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
        //System.out.println(repository.findByCategory(category));
        Serie temp = repository.findByCategory("Intradat"); 
        Date dateTemp = new Date();
        if(temp == null){            
            repository.save(new Serie("Intradat", alpha.timeSeriesIntradat()));
        }else if(dateTemp.getTime()-repository.findByCategory("Intradat").fecha.getTime()>300000){
            repository.delete(temp);
            repository.save(new Serie("Intradat", alpha.timeSeriesIntradat()));
        }
        System.out.println(repository.findByCategory("Intradat"));
        return repository.findByCategory("Intradat").info;
    }

    @Override
    public String timeSeriesDaily() {
        //System.out.println(repository.findByCategory(category));
        Serie temp = repository.findByCategory("Day"); 
        Date dateTemp = new Date();
        if(temp == null){            
            repository.save(new Serie("Day", alpha.timeSeriesDaily()));
        }else if(dateTemp.getTime()-repository.findByCategory("Day").fecha.getTime()>300000){
            repository.delete(temp);
            repository.save(new Serie("Day", alpha.timeSeriesDaily()));
        }
        System.out.println(repository.findByCategory("Day"));
        return repository.findByCategory("Day").info;
    }

    @Override
    public String timeSeriesWeekly() {
        //System.out.println(repository.findByCategory(category));
        Serie temp = repository.findByCategory("Week"); 
        Date dateTemp = new Date();
        if(temp == null){            
            repository.save(new Serie("Week", alpha.timeSeriesWeekly()));
        }else if(dateTemp.getTime()-repository.findByCategory("Week").fecha.getTime()>300000){
            repository.delete(temp);
            repository.save(new Serie("Week", alpha.timeSeriesWeekly()));
        }
        System.out.println(repository.findByCategory("Week"));
        return repository.findByCategory("Week").info;
    }

    @Override
    public String timeSeriesMonthly() {
        //System.out.println(repository.findByCategory(category));
        Serie temp = repository.findByCategory("Month"); 
        Date dateTemp = new Date();
        if(temp == null){            
            repository.save(new Serie("Month", alpha.timeSeriesMonthly()));
        }else if(dateTemp.getTime()-repository.findByCategory("Month").fecha.getTime()>300000){
            repository.delete(temp);
            repository.save(new Serie("Month", alpha.timeSeriesMonthly()));
        }
        System.out.println(repository.findByCategory("Month"));
        return repository.findByCategory("Month").info;
    }
    
    private String persistance(String category){
        //System.out.println(repository.findByCategory(category));
        Serie temp = repository.findByCategory(category); 
        Date dateTemp = new Date();
        if(temp == null){            
            repository.save(new Serie(category, alpha.timeSeriesIntradat()));
        }else if(dateTemp.getTime()-repository.findByCategory(category).fecha.getTime()>300000){
            repository.delete(temp);
            repository.save(new Serie(category, alpha.timeSeriesIntradat()));
        }
        return repository.findByCategory(category).info;
    }
}
