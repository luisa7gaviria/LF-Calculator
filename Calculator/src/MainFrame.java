package Calculator.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame{ //Heredando el frame
    
    JTextField writeNums;
    public void initialize() {
        
        writeNums = new JTextField();

        //panel que contiene la parte superior 
        JPanel writeNumsPanel = new JPanel();
        writeNumsPanel.add(writeNums);

        //buttons 
        JButton num1 = new JButton("1");
        JButton num2 = new JButton("2");
        JButton num3 = new JButton("3");
        JButton num4 = new JButton("4");

        //listener
        // num1.addActionListener(new ActionListener() {

        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         String typeNumbers = num1.getText();
        //         writeNums.setText(typeNumbers);
                
        //     }
            
        // });

        //Panel para botones
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(5, 4, 5, 5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(num1);
        buttonsPanel.add(num2);
        buttonsPanel.add(num3);
        buttonsPanel.add(num4);


        //panel donde irá contenido
        JPanel mainPanel = new JPanel();
        //Agregamos características al panel
        mainPanel.setLayout(new BorderLayout()); //distribucion
        mainPanel.setBackground(new Color(197,67,24)); //fondo
        mainPanel.add(writeNumsPanel, BorderLayout.NORTH); // situamos el campo de texto arriba
        mainPanel.add(buttonsPanel, BorderLayout.CENTER);

        add(mainPanel);

        setTitle("FL Calculator"); //titulo del programa
        setSize(new Dimension(400, 500)); //Dimensiones
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Comportamiento al cerrar
        setVisible(true);
    }
}
