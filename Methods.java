package CalculatorProject;

public class Methods {
private static double Pi; 
  public Methods() {
    Pi = 3.14;
  }
  
  public double areaOfRect(double l, double h) {
    return (l * h);
    
  }
  public double areaOfTri(double b, double h) {
    return (b * h) * 0.5;
    
  }
  public double areaOfCircle(double r) {
    return (Pi * (r * r));
    
}
}