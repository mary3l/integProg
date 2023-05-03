/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.xmlparser;

/**
 *
 * @author User
 */
public class XMLParser {

    public static void main(String[] args) throws Exception {
        MyXMLParser xmlParser1 = new MyXMLParser();
        xmlParser1.parseXMLPlantCatalog("plant_catalog.xml");
        
        MyXMLParser xmlParser2 = new MyXMLParser();
        xmlParser2.parseXMLFoodMenu("food_menu.xml");
        
        MyXMLParser xmlParser3 = new MyXMLParser();
        xmlParser1.parseXMLCDCatalog("cd_catalog.xml");
    }
}
