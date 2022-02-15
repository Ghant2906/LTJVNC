/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1.LTHDT.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 *
 * @author DELL
 */
public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setTitle("Calculator");
        
        frame.setLayout(new BorderLayout());
        
        
        JPanel p = new JPanel(new GridLayout());
        JPanel p1 = new JPanel(new GridLayout(4,5));
        
        p.setPreferredSize(new Dimension(400, 50));
        p.add(new JTextField());
        
        p1.add(new JButton("7"));
        p1.add(new JButton("8"));
        p1.add(new JButton("9"));
        p1.add(new JButton("/"));
        p1.add(new JButton("sqrt"));
        p1.add(new JButton("4"));
        p1.add(new JButton("5"));
        p1.add(new JButton("6"));
        p1.add(new JButton("*"));
        p1.add(new JButton("%"));
        p1.add(new JButton("1"));
        p1.add(new JButton("2"));
        p1.add(new JButton("3"));
        p1.add(new JButton("-"));
        p1.add(new JButton("1/x"));
        p1.add(new JButton("0"));
        p1.add(new JButton("."));
        p1.add(new JButton("C"));
        p1.add(new JButton("="));
        p1.add(new JButton("+"));
        
        frame.add(p,BorderLayout.NORTH);
        frame.add(p1,BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
