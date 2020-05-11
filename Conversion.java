import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
/* We have used JFrame class for layouts and also implemented ActionListener to perform action related to events for buttons and TextField*/
public class Conversion extends JFrame implements ActionListener
{
int c;
String s1,s2,s3,s4,s5; //declare the strings for calculation
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13; //declare the Jbuttons for adding 1 2 3 numbers as buttons 
JPanel p,p1; //Declare Jpanel to add the componenets into panel
JTextField tf; //declare tedxtfield to take the input
TextArea area; //To Display the output in TextArea
Conversion() {
JLabel l=new JLabel(); // To dsplay the label 
JFrame f=new JFrame(); //Declare Frame To add all the componenets into a frame
//we have declared two panles for textfield and calculation.
p=new JPanel();
p1=new JPanel();
area=new TextArea();  //create an object for textArea
area.setBounds(30,30,200,200); 
JSplitPane pane =new JSplitPane(SwingConstants.VERTICAL,p,p1); //declare and create an object for JSplitPane to split the textArea and buttons into left and right
JLabel l1=new JLabel("Weight in pounds");
l1.setBounds(50,50, 100,30);  
tf=new JTextField(16);
tf.setBounds(50,50,150,20);
b1 = new JButton("1");
b1.addActionListener(this);
b2= new JButton("2");
b2.addActionListener(this);
b3= new JButton("3");
b3.addActionListener(this);
b4= new JButton("4");
b4.addActionListener(this); /**** Creating objects for Buttons, labels and textfield ****/
b5=new JButton("5");
b5.addActionListener(this);
b6=new JButton("6");
b6.addActionListener(this);
b7=new JButton("7");
b7.addActionListener(this);
b8=new JButton("8");
b8.addActionListener(this);
b9=new JButton("9");
b9.addActionListener(this);
b10=new JButton("C");
b10.addActionListener(this);
b11=new JButton("0");
b11.addActionListener(this);
b12=new JButton("*");
b12.addActionListener(this);
b13=new JButton("Convert");
b13.addActionListener(this);
b1.setPreferredSize(new Dimension(50, 60));
b2.setPreferredSize(new Dimension(50, 60));
b3.setPreferredSize(new Dimension(50, 60));
b4.setPreferredSize(new Dimension(50, 60));
b5.setPreferredSize(new Dimension(50, 60)); /**** Setting the dimentions of the buttons ****/
b6.setPreferredSize(new Dimension(50, 60));
b7.setPreferredSize(new Dimension(50, 60));
b8.setPreferredSize(new Dimension(50, 60));
b9.setPreferredSize(new Dimension(50, 60));
b10.setPreferredSize(new Dimension(50, 60));
b11.setPreferredSize(new Dimension(50, 60));
b12.setPreferredSize(new Dimension(50, 60));
b13.setPreferredSize(new Dimension(154,20));
//Add the componenets into panel
p1.add(area); //Add the textfield panel into P1 instance of panel
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4); //Add the buttons and tedxtfield into P instance 
p.add(b5);
p.add(b6);
p.add(b7);
p.add(b8);
p.add(b9);
p.add(b10);
p.add(b11);
p.add(b12);
p.add(b13);
p.add(l1);
p.add(tf);
f.add(pane); //Add the JSplitPane object into frame
f.setSize(200,500); //set the size for the frame
        f.setVisible(true); //set visablity to true for vewing the componenets
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close the frame 
}
// actionPerformed method is used to perform the conversion from weight pound into kilograms
public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
			//when we press button it will take the input of textfield which is NULL and appends 1 to it and displays the button you pressedin the tedxtfield
            s3 = tf.getText();
            s4 = "1";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b2)
        {
            s3 = tf.getText();
            s4 = "2";
            s5 = s3+s4;
            tf.setText(s5);
			
        }
        if(e.getSource()==b3)
        {
            s3 = tf.getText();
            s4 = "3";
            s5 = s3+s4;
            tf.setText(s5);
        }if(e.getSource()==b4)
        {
            s3 = tf.getText();
            s4 = "4";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b5)
        {
            s3 = tf.getText();
            s4 = "5";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b6)
        {
            s3 = tf.getText();
            s4 = "6";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b7)
        {
            s3 = tf.getText();
            s4 = "7";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b8)
        {
            s3 = tf.getText();
            s4 = "8";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b9)
        {
            s3 = tf.getText();
            s4 = "9";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b10)
        {
            tf.setText("");
        }
        if(e.getSource()==b11)
        {
            s3 = tf.getText();
            s4 = "0";
            s5 = s3+s4;
            tf.setText(s5);
        }
 if(e.getSource()==b12)
        {
			// When we press C button it will clear the output.
            s1 = tf.getText();
            tf.setText("");

        }
if(e.getSource()==b13)
        {
			s1 = tf.getText();
			String R3=" ";
               double n = Double.parseDouble(s1)*0.453592; // multiply the string value by converting into double with 0.453592
                tf.setText(String.valueOf(n));
				String R1=String.valueOf(n); //convert the output into string 
				/* The below code is used to convert the string output and displays the output in three decimal numbers   */
				int r=0;
				int index = R1.indexOf('.'); 
				for(int i=0;i<index;i++) {
					    
						R3=R3+R1.charAt(i);
					}
					R3=R3+R1.charAt(index);
					index++;
					while(r!=3) {
						r++;
						R3=R3+R1.charAt(index);
						index++;
					}
					
				String R2;
				R2=s1+" "+"Weight in pounds"+" "+R3+" "+"kilograms"+"\n";
				area.append(R2); //append the ouput into textarea
}
}
public static void main(String[] abc)
    {
        Conversion v = new Conversion();
    }
}