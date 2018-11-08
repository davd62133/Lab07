/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.controllers;

import com.mercado.services.MercadoService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2123162
 */
@Service
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/mercado")
public class MercadoController {
    
    @Autowired
    MercadoService ms;
    
    @RequestMapping(value ="/Intradat",method = RequestMethod.GET)        
    public ResponseEntity<?> manejadorGetIntradat(){
 	try { 			
            return new ResponseEntity<>(ms.timeSeriesIntradat(),HttpStatus.ACCEPTED);
 	} catch (Exception ex) {
            Logger.getLogger(MercadoController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error ",HttpStatus.NOT_FOUND);
 	}  
    }  
    
    @RequestMapping(value ="/Day",method = RequestMethod.GET)        
    public ResponseEntity<?> manejadorGetDay(){
 	try { 			
            return new ResponseEntity<>(ms.timeSeriesDaily(),HttpStatus.ACCEPTED);
 	} catch (Exception ex) {
            Logger.getLogger(MercadoController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error ",HttpStatus.NOT_FOUND);
 	}  
    }  
    
    @RequestMapping(value ="/Week",method = RequestMethod.GET)        
    public ResponseEntity<?> manejadorGetWeek(){
 	try { 			
            return new ResponseEntity<>(ms.timeSeriesWeekly(),HttpStatus.ACCEPTED);
 	} catch (Exception ex) {
            Logger.getLogger(MercadoController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error ",HttpStatus.NOT_FOUND);
 	}  
    } 
    
    @RequestMapping(value ="/Month",method = RequestMethod.GET)        
    public ResponseEntity<?> manejadorGetMonth(){
 	try { 			
            return new ResponseEntity<>(ms.timeSeriesMonthly(),HttpStatus.ACCEPTED);
 	} catch (Exception ex) {
            Logger.getLogger(MercadoController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Error ",HttpStatus.NOT_FOUND);
 	}  
    }
    

    public MercadoService getMs() {
        return ms;
    }

    public void setMs(MercadoService ms) {
        this.ms = ms;
    }
    
    
}
