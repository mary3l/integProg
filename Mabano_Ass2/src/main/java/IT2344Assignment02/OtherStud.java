/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IT2344Assignment02;

/**
 *
 * @author jbcan
 */
public class OtherStud extends Student {
//Evaluation on Retention Rules
//if NOT under probation but WPA is below 75% retained, but put on probation
//if UNDER probation and WPA is below 75%, advised to transfer to other school.


//fields Computer Studies Students
  private String statusDisplay;//for the print display method, this will serve as the method to be called in the main to avoid redundancy of the System.out.println method
  private boolean underProbation;//boolean attribute to know whether the student is under Probation or not
  
  //constructors
  public OtherStud (double wpa, boolean underProbation) {
    super(wpa);
    this.underProbation = underProbation; 
    this.statusDisplay = status();
  }
 
//method for printing the status of the student
  public void printStatus() {
    System.out.println(
        "Other Student is " + this.statusDisplay);
  }
 
    @Override
    //conditions on the Retention Rules 
    public String status() {      
        
    //by default all students are regular or retained
    String status = "retained";
    
    if (this.wpa < 75 && underProbation == false){
        status = "under_probation"; //academic year WPA reached 75 but has a failing grade
    }
    else if (this.wpa < 75 && underProbation == true){
        status = "advised_to_transfer_school"; //academic year WPA reached 89 but has a failing grade
    }
    
    return status;
    }
}
    

