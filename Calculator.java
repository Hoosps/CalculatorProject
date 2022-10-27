

public class Calculator {
  public static void main(String[] args) {
    
    Methods geometry = new Methods()[;]
      
    
    
  }
  public static double add(double a, double b) {
    return a + b;
   
  }
  public static double sub(double a, double b) {
    return a - b;
  }
  public static double multiply(double a, double b) {
    return a * b;
   
  }
  public static double divide(double a, double b) {
    return a / b;
   
  }
  public static double remainder(double a, double b) {
    return a % b;
   
  }
  public static double randomNum(int max, int min) {
    if (max < 0 && min < 0) {
      return (int)(Math.random() * (max - min) + min);
    } else {
      return (int)(Math.random() * ((max - min) + 1) + min);
      
    }
     
  }
}
