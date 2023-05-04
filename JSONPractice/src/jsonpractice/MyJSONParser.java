/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jsonpractice;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author mgmabano
 */
public class MyJSONParser {

    public static void parseJSON (String fileName){
        
        JSONParser parser = new JSONParser();
        

        try (FileReader reader = new FileReader(fileName)){  
        

        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObj = (JSONObject) parser.parse(reader);

        JSONArray jsonarray = (JSONArray)jsonObj.get("users");

        

        System.out.println("UserID \t First Name \t Last Name \t Phone Number \t Email");
        for (int i = 0; i < jsonarray.size(); i++) {

        JSONObject object = (JSONObject)jsonarray.get(i);
        
        long userId = (long) object.get("userId");
        String firstName = (String) object.get("firstName");
        String lastName = (String) object.get("lastName");
        String phoneNumber =(String) object.get("phoneNumber");
        String emailAddress = (String) object.get("emailAddress");
        System.out.println(+ userId + "\t" + firstName + "\t\t" + lastName + "\t\t" + phoneNumber + "\t\t" + emailAddress);        
}
    }
    catch(Exception e){
    e.printStackTrace();
    }
 
        }
    }
