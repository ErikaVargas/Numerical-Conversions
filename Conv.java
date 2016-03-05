/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversions;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Erika
 */
public class Conv extends JFrame
implements ActionListener {
    private JButton buttonBin, buttonDec, buttonOct, buttonHex;
    private JTextField bin1, bin2, dec1, dec2, oct1, oct2, hex1, hex2;
    private JLabel dot, bin, dec, oct, hex, title, space;
    
    public static void main(String[] args){
        Conv frame = new Conv();
        frame.setSize(450, 400);
        frame.createGUI();
        frame.setVisible(true);
       
    }
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        title = new JLabel("Numerical Base Converter", JLabel.CENTER);
        title.setFont(new Font("Brush Script MT", Font.BOLD, 38));
        title.setForeground(Color.LIGHT_GRAY);
        JPanel titlePanel= new JPanel();
        titlePanel.setBackground(Color.BLACK);
        titlePanel.add(title);
        window.add(titlePanel);
        
         dec = new JLabel("Decimal    ");
        window.add(dec);
        dec1 = new JTextField(8);
        window.add(dec1);
        dot = new JLabel(".");
        window.add(dot);
        dec2 = new JTextField(8);
        window.add(dec2);
        space = new JLabel("         ");
        window.add(space);
        buttonDec = new JButton("Go");
        window.add(buttonDec);
        buttonDec.addActionListener(this);
          space = new JLabel("         ");
        window.add(space);
        
         bin = new JLabel("Binary        ");
        window.add(bin);
        bin1 = new JTextField(8);
        window.add(bin1);
        dot = new JLabel(".");
        window.add(dot);
        bin2 = new JTextField(8);
        window.add(bin2);
        space = new JLabel("          ");
        window.add(space);
        buttonBin = new JButton("Go");
        window.add(buttonBin);
        buttonBin.addActionListener(this);
        space = new JLabel("         ");
        window.add(space);
        
        oct = new JLabel("Octal         ");
        window.add(oct);
        oct1 = new JTextField(8);
        window.add(oct1);
        dot = new JLabel(".");
        window.add(dot);
        oct2 = new JTextField(8);
        window.add(oct2);
        space = new JLabel("         ");
        window.add(space);
        buttonOct = new JButton("Go");
        window.add(buttonOct);
        buttonOct.addActionListener(this);
          space = new JLabel("         ");
        window.add(space);
        
        hex = new JLabel("Hexa         ");
        window.add(hex);
        hex1 = new JTextField(8);
        window.add(hex1);
        dot = new JLabel(".");
        window.add(dot);
        hex2 = new JTextField(8);
        window.add(hex2);
        space = new JLabel("         ");
        window.add(space);
        buttonHex= new JButton("Go");
        window.add(buttonHex);
        buttonHex.addActionListener(this);
          space = new JLabel("         ");
        window.add(space);
    }
    public void actionPerformed(ActionEvent event){
        
       
        
          Object source = event.getSource();
          if(source == buttonBin){
              String readBin= bin1.getText();
              
             String convDec = Integer.toString(Integer.parseInt(readBin, 2), 10);
              String convOct = Integer.toString(Integer.parseInt(readBin, 2), 8);
              String convHex = Integer.toString(Integer.parseInt(readBin, 2), 16);
              dec1.setText(convDec);
              oct1.setText(convOct);
              hex1.setText(convHex);
          }
          if(source == buttonDec){ // Reads whole number and converts it to the rest of the bases 
              String readDec = dec1.getText();
            
               String convBin = Integer.toString(Integer.parseInt(readDec, 10), 2);
               String convOct = Integer.toString(Integer.parseInt(readDec, 10), 8);
               String convHex = Integer.toString(Integer.parseInt(readDec, 10), 16);
               bin1.setText(convBin);
               oct1.setText(convOct);
               hex1.setText(convHex);
          }
          if(source == buttonOct){
           String readOct = oct1.getText();
           
           String convBin = Integer.toString(Integer.parseInt(readOct, 8), 2);
           String convDec = Integer.toString(Integer.parseInt(readOct, 8), 10);
           String convHex = Integer.toString(Integer.parseInt(readOct, 8), 16);
           bin1.setText(convBin);
           dec1.setText(convDec);
           hex1.setText(convHex);
          }
          if(source == buttonHex){
              String readHex = hex1.getText();
              
              String convBin = Integer.toString(Integer.parseInt(readHex, 16), 2);
              String convDec = Integer.toString(Integer.parseInt(readHex, 16), 10);
              String convOct = Integer.toString(Integer.parseInt(readHex, 16), 8);
              bin1.setText(convBin);
              dec1.setText(convDec);
              oct1.setText(convOct);
          }
    }
   
    
}
