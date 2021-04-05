public class testcon{
  public static void main(String[] args){
    PoundsToKG conv = new PoundsToKG();
    System.out.println("1 kg is " + conv.KgToPounds(1) + " pounds");
    System.out.println("1.2 kg is " + conv.KgToPounds(1.2f) + " pounds");
    System.out.println("1.2 kg is " + conv.KgToPounds(1.2) + " pounds");
    System.out.println("1 pounds is " + conv.PoundsToKg(1) + " Kg");
    System.out.println("1.2 pounds is " + conv.KgToPounds(1.2f) + " Kg");
    System.out.println("1.2 pounds is " + conv.KgToPounds(1.2) + " Kg");

    InchesToMetres con = new InchesToMetres();
    System.out.println("1 inch is " + con.InchToM(1) + " metres");
    System.out.println("1.2 inches is " + con.InchToM(1.2f) + " metres");
    System.out.println("1.2 inches is " + con.InchToM(1.2) + " metres");
    System.out.println("1 metre is " + con.MToInch(1) + " inches");
    System.out.println("1.2 metre is " + con.MToInch(1.2f) + " inches");
    System.out.println("1.2 metre is " + con.MToInch(1.2) + " inches");
    System.out.println("1 cm is " + con.cmToM(1) + " metres");
    System.out.println("1.2 cm is " + con.cmToM(1.2f) + " metres");
    System.out.println("1.2 cm is " + con.cmToM(1.2) + " metres");

    CalcBMI cal = new CalcBMI();
    System.out.println("A person who is 1.76m tall and weighs 75kg has a BMI of "
                      + cal.BMI(75.0f, 1.76f));
    System.out.println("A person who is 1.76m tall and weighs 75kg has a BMI of "
                      + cal.BMI(75.0f, 1.76));
    System.out.println("A person who is 1.76m tall and weighs 75kg has a BMI of "
                      + cal.BMI(75.0, 1.76f));
    System.out.println("A person who is 1.76m tall and weighs 75kg has a BMI of "
                      + cal.BMI(75.0, 1.76));
    System.out.println("A person who is 1.76m tall and weighs 75kg has a BMI of "
                      + cal.BMI(75, 1.76f));
    System.out.println("A person who is 1.76m tall and weighs 75kg has a BMI of "
                      + cal.BMI(75, 1.76));
  }
}
