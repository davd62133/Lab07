/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parcial.mercado.services.impl;

import com.parcial.mercado.services.MercadoService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2123162
 */
@Service
public class AlphaVantage implements MercadoService{
    
    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL = "https://www.alphavantage.co/query?function=";
    

    @Override
    public String timeSeriesIntradat() {
        String function = "TIME_SERIES_INTRADAY&symbol=MSFT&interval=5min&apikey=89BDL5EGGYBPY31J"; 
        StringBuffer response = new StringBuffer();
        try {
            URL obj = new URL(GET_URL + function);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", USER_AGENT);            
                        
            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;                
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
            }            
        } catch (MalformedURLException ex) {
            Logger.getLogger(AlphaVantage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AlphaVantage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response.toString();
    }

    @Override
    public String timeSeriesDaily() {
        String function = "TIME_SERIES_DAILY&symbol=MSFT&interval=5min&apikey=89BDL5EGGYBPY31J"; 
        StringBuffer response = new StringBuffer();
        try {
            URL obj = new URL(GET_URL + function);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", USER_AGENT);            
                        
            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;                
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
            }            
        } catch (MalformedURLException ex) {
            Logger.getLogger(AlphaVantage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AlphaVantage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response.toString();
    }
  
    @Override
    public String timeSeriesWeekly() {
        String function = "TIME_SERIES_WEEKLY&symbol=MSFT&interval=5min&apikey=89BDL5EGGYBPY31J"; 
        StringBuffer response = new StringBuffer();
        try {
            URL obj = new URL(GET_URL + function);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", USER_AGENT);            
                        
            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;                
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
            }            
        } catch (MalformedURLException ex) {
            Logger.getLogger(AlphaVantage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AlphaVantage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response.toString();
    }
  

    @Override
    public String timeSeriesMonthly() {
        String function = "TIME_SERIES_MONTHLY&symbol=MSFT&interval=5min&apikey=89BDL5EGGYBPY31J"; 
        StringBuffer response = new StringBuffer();
        try {
            URL obj = new URL(GET_URL + function);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", USER_AGENT);            
                        
            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;                
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
            }            
        } catch (MalformedURLException ex) {
            Logger.getLogger(AlphaVantage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AlphaVantage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response.toString();
    }
   
}
