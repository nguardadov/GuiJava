/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author uca
 */
public class Ventana extends JFrame{

    private JTextField caja1,caja2;
    private JButton boton;
    
    public Ventana() {
        super("Titulo de la ventana");
        initComponent();
    }

    public void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        caja1 = new JTextField("Mensaje");
        caja1.setBounds(10, 100, 150, 30);

        
        boton = new JButton("Click aca");
        boton.setBounds(10, 150, 150, 30);
        Container contenedor = getContentPane();
        
        caja2 = new JTextField();
        caja2.setBounds(10, 200, 150, 30);
        caja2.setEditable(false);
        contenedor.add(caja1);
        contenedor.add(boton);
        contenedor.add(caja2);
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    //JOptionPane.showMessageDialog(null,"Dististes click");
                    caja2.setText(caja1.getText());
            }
        });
       
        setSize(300,300);
    }
    
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    
    
}
