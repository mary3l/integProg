/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IT2344Assignment02;

/**
 *
 * @author jbcan
 */
public class ComputerScienceStud extends Student{
//Evaluation on Retention Rules
//evaluated by two metrics : WPA and major subjects computed average(MSCA)

//fields Computer Studies Students
//both criteria should be 80%
//private double wpa; //cumulative wpa // not initialized anymore since wpa is in the student class extended in this class
  private double msca;//major subjects computed average
  private String statusDisplay; //for the print display method, this will serve as the method to be called in the main to avoid redundancy of the System.out.println method
  private boolean underProbation; //boolean attribute to know whether the student is under Probation or not

  
  //constructors
  public ComputerScienceStud(double wpa, double msca, boolean underProbation) {
    super(wpa);
    this.msca = msca;
    this.underProbation = underProbation;
    this.statusDisplay = status();
  }
  //method for printing the status of the student
  public void printStatus() {
    System.out.println("Computer Studies Student is " + this.statusDisplay);
  }
    @Override
    public String status() {
    //conditions on the Retention Rules 
    String status;
    if (this.wpa<80 && this.msca<80){ //this is if both wpa and msca are BELOW the passing grade and NOT under probation
        status = "advised_to_shift";
    }
//academic year WPA 87%-88.9% are retained but placed on probation
    else if (this.wpa < 80 || this.msca < 80 && underProbation == false) {//this is if both wpa or msca are BELOW the passing grade and NOT under probation
        status = "under_probation";
    }
    else if (this.wpa < 80 || this.msca < 80 && underProbation == true){//this is if both wpa and msca are BELOW the passing grade and UNDER probation
        status = "advised_to_shift"; 
    }
    else{ 
        status = "retained";//BOTH ARE PASSED AND NOT UNDER PROBATION
    }

    return status;
  }
}

