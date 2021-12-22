import java.awt.*;
import java.awt.event.*;
 
class calc implements ActionListener
{
    //Declaring Objects
    Frame f=new Frame();
    Label l1=new Label("First Number");
    Label l2=new Label("Second Number");
    Label l3=new Label("Result");
    
    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();
    
    Button b1=new Button("Add");
    Button b2=new Button("Sub");
    Button b3=new Button("Mul");
    Button b4=new Button("Div");
    Button b5=new Button("Cancel");
    
    calc()
    {
        //Giving Coordinates
        l1.setBounds(100,100,150,30);
        l2.setBounds(100,140,150,30);
        l3.setBounds(100,180,150,30);
        
        t1.setBounds(300,100,150,30);
        t2.setBounds(300,140,150,30);
        t3.setBounds(300,180,150,30);
        
        b1.setBounds(50,350,60,30);
        b2.setBounds(110,350,60,30);
        b3.setBounds(170,350,60,30);
        b4.setBounds(230,350,60,30);
        b5.setBounds(290,350,60,30);
        
        //Adding components to the frame
        f.add(l1);
        f.add(l2);
        f.add(l3);
        
        f.add(t1);
        f.add(t2);
        f.add(t3);
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,450);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        
        if(e.getSource()==b1)
        {
            t3.setText(String.valueOf(n1+n2));
        }
            
        if(e.getSource()==b2)
        {
            t3.setText(String.valueOf(n1-n2));
        }
        
        if(e.getSource()==b3)
        {
            t3.setText(String.valueOf(n1*n2));
        }
        
        if(e.getSource()==b4)
        {
            t3.setText(String.valueOf(n1/n2));
        }
        
        if(e.getSource()==b5)
        {
            System.exit(0);
        }
    }
    
    public static void main(String...s)
    {
        new calc();
    }
}
