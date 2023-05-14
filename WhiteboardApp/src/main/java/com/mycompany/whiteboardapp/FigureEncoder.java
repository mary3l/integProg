/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.whiteboardapp;

import jakarta.websocket.EncodeException;
import jakarta.websocket.Encoder;
import jakarta.websocket.EndpointConfig;

/**
 *
 * @author User
 */
public class FigureEncoder implements Encoder.Text<Figure> {

    @Override
    public String encode(Figure figure) throws EncodeException {
        return figure.getJson().toString(); 
    }
    
    @Override
    public void init(EndpointConfig ec) {
        System.out.println("init"); 
    }

    @Override
    public void destroy() {
          System.out.println("destroy"); 
    }

}
