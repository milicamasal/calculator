package digitron;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame{
    JLabel a = new JLabel("a");
    JLabel b = new JLabel("b");
    JLabel result = new JLabel("result");
    JButton add = new JButton("+");
    JButton sub = new JButton("-");
    int number1 =0;
         int number2=0;
    public JLabel getA() {
        return a;
    }

    public JLabel getB() {
        return b;
    }

    public JLabel getResult() {
        return result;
    }

    public JTextField getTxta() {
        return txta;
    }

    public JTextField getTxtb() {
        return txtb;
    }

    public JTextField getTxtResult() {
        return txtResult;
    }
    BorderLayout bl=new BorderLayout();
    JTextField txta = new JTextField();
    
    JTextField txtb = new JTextField();
    JTextField txtResult = new JTextField();
    
    JPanel panel = new JPanel(new GridBagLayout());

    GridBagConstraints gbc = new GridBagConstraints();

    public Calculator() throws HeadlessException {
        
        getContentPane().add(panel,BorderLayout.CENTER);
        txta.setPreferredSize(new Dimension(80,20));
        txtb.setPreferredSize(new Dimension(80,20));
        txtResult.setPreferredSize(new Dimension(80,20));
        
        txtResult.setEditable(false);
       
        gbc.gridx = 1;
        gbc.gridy =1;
        gbc.insets = new Insets(5,10,5,10);
        panel.add(a,gbc);
        gbc.gridx++;
        panel.add(txta,gbc);
        
          gbc.gridx = 1;
        gbc.gridy =2;
        panel.add(b,gbc);
        gbc.gridx++;
        panel.add(txtb,gbc);
        
        gbc.gridx = 1;
        gbc.gridy =3;
        panel.add(result,gbc);
        gbc.gridx++;
        panel.add(txtResult,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(add,gbc);
        gbc.gridx++;
        panel.add(sub,gbc);
         
  if(!(txta.getText().equals("")) )  {try{number1 = Integer.parseInt(txta.getText());}
      catch(Exception e){
          JOptionPane.showMessageDialog(this, "Wrong input!");
      }
  }
       if(!(txtb.getText().equals(""))) {try{number2 = Integer.parseInt(txtb.getText());}
      catch(Exception e){
          JOptionPane.showMessageDialog(this, "Wrong input!");
      }
  }
       
       add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(!(txta.getText().equals(""))){try{number1 = Integer.parseInt(txta.getText());}
      catch(Exception e){
          JOptionPane.showMessageDialog(null, "Wrong input!");
      }
  }
       if(!(txtb.getText().equals(""))) {try{number2 = Integer.parseInt(txtb.getText());}
      catch(Exception e){
          JOptionPane.showMessageDialog(null, "Wrong input!");
      }
  }         
       
       txtResult.setText((number1+number2) +"");
            }
        });
        
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(!(txta.getText().equals("")))  number1 = Integer.parseInt(txta.getText());
       if(!(txtb.getText().equals(""))) number2 = Integer.parseInt(txtb.getText());
                 txtResult.setText((number1-number2) + "");
            }
        });
    }

    
  
    
    @Override
    public Container getContentPane() {
        return super.getContentPane(); 
    
    
}
    
}

