/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.Date;
import org.springframework.data.annotation.Id;

/**
 *
 * @author 2123162
 */
public class Serie {
    @Id
    public String id;
    
    public String category;
    public String info;
    public Date fecha;

    public Serie() {
        fecha = new Date();
    }

    public Serie(String category, String info) {
        this.category = category;
        this.info = info;
        fecha = new Date();
    }
    
    
}
