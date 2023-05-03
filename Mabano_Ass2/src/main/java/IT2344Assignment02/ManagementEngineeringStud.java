/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IT2344Assignment02;

/**
 *
 * @author jbcan
 */
public class ManagementEngineeringStud extends Student {
//Evaluation on Retention Rules
//academic year WPA should be 89%
//academic year WPA 87%-88.9% are retained but placed on probation

//fields Computer Studies Students
  private String statusDisplay;//for the print display method, this will serve as the method to be called in the main to avoid redundancy of the System.out.println method
  private boolean underProbation;//boolean attribute to know whether the student is under Probation or not
  private boolean hasFailingGrade;//boolean attribute to know whether the student is has a failing grade or not

  //constructors
  public ManagementEngineeringStud(double wpa, boolean underProbation, boolean hasFailingGrade) {
    super(wpa);
    this.underProbation = underProbation; 
    this.hasFailingGrade = hasFailingGrade;
    this.statusDisplay = status();
  }
  //method for printing the status of the student
  public void printStatus() {
    System.out.println(
        "Management Enginnering Student is " + this.statusDisplay);
  }

    @Override
    public String status() {
    //conditions on the Retention Rules 
    String status = null;
   
    if (this.wpa>=89 && hasFailingGrade==false){//this is if wpa and NOT under probation
        status = "retained"; 
    }
    else if (this.wpa >= 87 && this.wpa < 89 && underProbation == false && hasFailingGrade == false ) {//academic year WPA 87%-88.9% are retained but placed on probation
        status = "under_probation";
    }
    else if ((hasFailingGrade == true) || (this.wpa < 87) || (this.wpa >= 87 && this.wpa < 89 && underProbation == true)){//academic year WPA is 87%-88.9% and has a failing grade but not under probation
         
        status = "advised_to_shift"; 
    }
//    else{//academic year WPA is 87%-88.9% and UNDER probation
//        status = "advised_to_shift";
//    }
    return status;
  }
}
