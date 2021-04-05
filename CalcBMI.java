public class CalcBMI{
  public float BMI(float weight, float height){
    return (float)(weight / (Math.pow(height, 2)));
  }
  public float BMI(float weight, double height){
    return (float)(weight / (Math.pow(height, 2)));
  }
  public float BMI(double weight, float height){
    return (float)(weight / (Math.pow(height, 2)));
  }
  public float BMI(double weight, double height){
    return (float)(weight / (Math.pow(height, 2)));
  }
  public float BMI(int weight, float height){
    return (float)(weight / (Math.pow(height, 2)));
  }
  public float BMI(int weight, double height){
    return (float)(weight / (Math.pow(height, 2)));
  }
}
