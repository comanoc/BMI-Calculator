public class InchesToMetres{
  private static float conRate = 0.0254f;

  public float InchToM(int inch){
    return (inch * conRate);
  }
  public float InchToM(float inch){
    return (inch * conRate);
  }
  public float InchToM(double inch){
    return (float)(inch * conRate);
  }
  public float MToInch(int m){
    return (m / conRate);
  }
  public float MToInch(float m){
    return (m / conRate);
  }
  public float MToInch(double m){
    return (float)(m / conRate);
  }
  public float cmToM(int cm){
    return cm / 100f;
  }
  public float cmToM(float cm){
    return cm / 100f;
  }
  public float cmToM(double cm){
    return (float)(cm / 100f);
  }
}
