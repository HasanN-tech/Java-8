package work;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {

        JFrame frame=new JFrame("My Window");
        frame.setSize(400,400);

        JButton button=new JButton("Click me!!");

        //HANDLING THE ACTION BY ANONYMOUS CLASS
        /* button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
                JOptionPane.showMessageDialog(null,"Hey Button Is Clicked");
            }
        }); */

        //HANDLING THE ACTION BY LAMBDA EXPRESSION
        button.addActionListener((ActionEvent e)->{
            System.out.println("Button Clicked");
            JOptionPane.showMessageDialog(null,"Hey Button Is Clicked");
        });

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
