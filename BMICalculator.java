import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Random;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMICalculator extends JFrame implements ActionListener{
  JTextField weightDisplay, heightDisplay;
  JButton submit, clear, exit;

  PoundsToKG weightCon = new PoundsToKG();
  InchesToMetres heightCon = new InchesToMetres();
  CalcBMI calc = new CalcBMI();
  float weight;
  float height;
  float res;

  public BMICalculator(){
    JPanel input1 = new JPanel(new GridLayout(1,2,10,5));

    input1.add(new JLabel("Enter weight in Pounds"));
    weightDisplay = new JTextField(6);
    input1.add(weightDisplay);

    JPanel input2 = new JPanel(new GridLayout(1,2,10,5));
    input2.add(new JLabel("Enter height in Inches"));
    heightDisplay = new JTextField(6);
    input2.add(heightDisplay);

    JPanel bottomLeft = new JPanel();
    JPanel bottomRight = new JPanel();

    JPanel buttons = new JPanel(new GridLayout(1,5,5,5));
    buttons.add(bottomLeft);

    submit = new JButton("Submit");
    submit.addActionListener(this);
    buttons.add(submit);

    clear = new JButton("Clear");
    clear.addActionListener(this);
    buttons.add(clear);

    exit = new JButton("Exit");
    exit.addActionListener(this);
    buttons.add(exit);

    buttons.add(bottomRight);

    JPanel parent = new JPanel(new GridLayout(3,1,5,5));
    parent.add(input1);
    parent.add(input2);
    parent.add(buttons);

    add(parent);
  }
  public static void main(String[] args){
    BMICalculator frame = new BMICalculator();

    frame.setTitle("BMI");
    frame.setSize(400,150);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == submit){
      try{
        height = Float.parseFloat(heightDisplay.getText());
        weight = Float.parseFloat(weightDisplay.getText());

        height = heightCon.InchToM(height);
        weight = weightCon.PoundsToKg(weight);

        res = calc.BMI(weight, height);
        String msg = String.format("A BMI of %.2f is ", res);
        if(res < 16){
          msg += "seriously underweight";
        }
        else if(res < 18){
          msg += "underweight";
        }
        else if(res < 24){
          msg += "normal weight";
        }
        else if(res < 29){
          msg += "overweight";
        }
        else if(res < 35){
          msg += "seriously overweight";
        }
        else{
          msg += "gravely overweight";
        }
        JOptionPane.showMessageDialog(null, msg, "BMI",
                                      JOptionPane.INFORMATION_MESSAGE);
      }catch(Exception err){
        JOptionPane.showMessageDialog(null, "error in values", "BMI",
                                      JOptionPane.INFORMATION_MESSAGE);
      }
    }else if(e.getSource() == clear){
      heightDisplay.setText("");
      weightDisplay.setText("");
    }else if(e.getSource() == exit){
      System.exit(1);
    }
  }
}
