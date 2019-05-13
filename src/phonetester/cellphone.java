/*
 */

package phonetester;

/**
 *
 * @author lewhi7273
 */
public class cellphone {
  private String carrier, type;
  private double speed, memory;
  private int numApps;
  
  
  public String getCarrier(){
      return carrier;
}
  public String getType(){
      return type;
  }
  public double getSpeed(){
      return speed;
  }
  public double getMemory(){
      return memory;
  }
  public int getNumApps(){
      return numApps;
}
  public void setCarrier(String car){
    carrier = car;
}
  public void setType(String typ){
    type = typ;  
  }
  public void setSpeed(double sped){
      speed = sped;
  }
  public void setMemory(double mem){
      memory = mem;
  }
  public void setNumApps(int nums){
      numApps = nums;
  }
}