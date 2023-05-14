/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.whiteboardapp;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import java.io.StringWriter;

/**
 *
 * @author User
 */
public class Figure {

    private JsonObject json;

    public JsonObject getJson() {
        return json;
    }

    public Figure(JsonObject json) {
        this.json = json;
    }

    public void setJson(JsonObject json) {
        this.json = json;
    }

    @Override
    public String toString() {
        StringWriter writer = new StringWriter();
        Json.createWriter(writer).write(json);
        return writer.toString();
    }
}
