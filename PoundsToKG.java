public class PoundsToKG{
  private static float conRate = 0.45359237f;
  public float KgToPounds(float kg){
    return (kg/conRate);
  }
  public float PoundsToKg(float pounds){
    return (pounds * conRate);
  }
  public float KgToPounds(int kg){
    return (kg/conRate);
  }
  public float PoundsToKg(int pounds){
    return (pounds * conRate);
  }
  public float KgToPounds(double kg){
    return (float)(kg/conRate);
  }
  public float PoundsToKg(double pounds){
    return (float)(pounds * conRate);
  }
}
