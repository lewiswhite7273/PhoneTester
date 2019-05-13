/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phonetester;

import java.util.Scanner;

/**
 *
 * @author lewhi7273
 */
public class PhoneTester {

  public static void main(String [] args){
      String carrier, type;
      int numapps;
      double speed, memory;
      Scanner input = new Scanner(System.in);
      
      //create a cell phone
      cellphone p2 = new cellphone();
      System.out.println("Enter your carrier");
      carrier = input.nextLine();
      p2.setCarrier(carrier);
      System.out.println("Enter the type of phone");
      type = input.nextLine();
      p2.setType(type);
      System.out.println("Enter the speed in GHZ");
      speed = input.nextDouble();
      p2.setSpeed(speed);
      System.out.println("Enter the memory in GB");
      memory = input.nextInt();
      p2.setMemory(memory);
      System.out.println("Finally, enter the number of apps");
      numapps = input.nextInt();
      p2.setNumApps(numapps);
      //original phone
    cellphone p1 = new cellphone();
    p1.setCarrier("Rogers");
    p1.setType("IPhone");
    p1.setSpeed(1.2);
    p1.setMemory(64.0);
    p1.setNumApps(10);

    System.out.println("Carrier = " + p1.getCarrier());
    System.out.println("Type of phone = " + p1.getType());
    System.out.println("Speed of phone = " + p1.getSpeed()+"Ghz");
    System.out.println("Memory = "+p1.getMemory()+"Gb");
    System.out.println("Number of Apps = "+p1.getNumApps());
    System.out.println("------------------------------------------");
    System.out.println("Carrier = " + p2.getCarrier());
    System.out.println("Type of phone = " + p2.getType());
    System.out.println("Speed of phone = " + p2.getSpeed()+"Ghz");
    System.out.println("Memory = "+p2.getMemory()+"Gb");
    System.out.println("Number of Apps = "+p2.getNumApps());
  }
     
}
