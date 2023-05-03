/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IT2344Assignment02;

/**
 *
 * @author jbcan
 */
public class IT2344Assignment02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 //Computer Science Studies Student Objects
    System.out.println("-------------------------------------Computer Science Students-------------------------------------");
    ComputerScienceStud compStudent1 = new ComputerScienceStud(100,100, false); //double wpa, double msca, boolean underProbation
    compStudent1.printStatus();// "Computer Studies Student is Retained"
    
    ComputerScienceStud compStudent2 = new ComputerScienceStud(79,100, false); //double wpa, double msca, boolean underProbation
    compStudent2.printStatus();// "Computer Studies Student is Under Probation"
    
    ComputerScienceStud compStudent3 = new ComputerScienceStud(100,79, true); //double wpa, double msca, boolean underProbation
    compStudent3.printStatus();// "Computer Studies Student is Advised to Shift"

    ComputerScienceStud compStudent4 = new ComputerScienceStud(79,79, false); //double wpa, double msca, boolean underProbation
    compStudent4.printStatus();// "Computer Studies Student is Advised to Shift"

 //Management Engineering Student Objects 
    System.out.println("-------------------------------------Management Engineering Students-------------------------------------");
    ManagementEngineeringStud engStudent1 = new ManagementEngineeringStud(100, false ,false); //double wpa, boolean underProbation, boolean hasFailingGrade
    engStudent1.printStatus();// "Management Enginnering Student is Retained"
    
    ManagementEngineeringStud engStudent2 = new ManagementEngineeringStud(88, false ,false); //double wpa, boolean underProbation, boolean hasFailingGrade
    engStudent2.printStatus();// "Management Enginnering Student is Under Probation"
    
    ManagementEngineeringStud engStudent3 = new ManagementEngineeringStud(88, true ,false); //double wpa, boolean underProbation, boolean hasFailingGrade
    engStudent3.printStatus();// "Management Enginnering Student is Advised to Shift"
    
    ManagementEngineeringStud engStudent4 = new ManagementEngineeringStud(100, false ,true); //double wpa, boolean underProbation, boolean hasFailingGrade
    engStudent4.printStatus();// "Management Enginnering Student is Advised to Shift"
    
 //Other Student Objects
    System.out.println("-------------------------------------Other Students-------------------------------------");
    OtherStud otherStudent1 = new OtherStud(75, false); //double wpa, boolean underProbation
    otherStudent1.printStatus();// Output should be "Other Student is Retained"
    
    OtherStud otherStudent2 = new OtherStud(74, false); //double wpa, boolean underProbation
    otherStudent2.printStatus();// Output should be "Other Student is Under Probation"
    
    OtherStud otherStudent3 = new OtherStud(74, true); //double wpa, boolean underProbation
    otherStudent3.printStatus();// Output should be "Other Student is Advised to Transfer School"
    }
    


}
