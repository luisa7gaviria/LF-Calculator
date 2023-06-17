package Calculator.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame{ //Heredando el frame
    
    JTextField writeNums;
    public void initialize() {
        
        writeNums = new JTextField();
        writeNums.setSize(new Dimension(350, 40));
        writeNums.setPreferredSize(new Dimension(350, 40));

        //panel que contiene la parte superior 
        JPanel writeNumsPanel = new JPanel();
        writeNumsPanel.add(writeNums);

        //buttons 
        JButton clear = new JButton("C");
        JButton divide = new JButton("/");
        JButton multiply = new JButton("*");
        JButton minus = new JButton("-");

        JButton num7 = new JButton("7");
        JButton num8 = new JButton("8");
        JButton num9 = new JButton("9");
        JButton plus = new JButton("+");

        JButton num4 = new JButton("4");
        JButton num5 = new JButton("5");
        JButton num6 = new JButton("6");
        JButton calculate = new JButton("=");

        JButton num1 = new JButton("1");
        JButton num2 = new JButton("2");
        JButton num3 = new JButton("3");
        JButton zero = new JButton("0");
        JButton decimal = new JButton(".");

        //listener
        num7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String typeDigits = num7.getText();
                writeNums.setText(writeNums.getText() + typeDigits);
                //esto se puede hacer de manera más dinamica creo, porque son muchos botones
            }
        });

        //Panel para botones
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(5, 4, 5, 5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(clear);
        buttonsPanel.add(divide);
        buttonsPanel.add(multiply);
        buttonsPanel.add(minus);
        buttonsPanel.add(num7);
        buttonsPanel.add(num8);
        buttonsPanel.add(num9);
        buttonsPanel.add(plus);
        buttonsPanel.add(num4);
        buttonsPanel.add(num5);
        buttonsPanel.add(num6);
        buttonsPanel.add(calculate);
        buttonsPanel.add(num1);
        buttonsPanel.add(num2);
        buttonsPanel.add(num3);
        buttonsPanel.add(zero);
        buttonsPanel.add(decimal);


        //panel donde irá contenido
        JPanel mainPanel = new JPanel();
        //Agregamos características al panel
        mainPanel.setLayout(new BorderLayout()); //distribucion
        mainPanel.setBackground(new Color(64, 68, 130)); //fondo
        mainPanel.add(writeNumsPanel, BorderLayout.NORTH); // situamos el campo de texto arriba
        mainPanel.add(buttonsPanel, BorderLayout.CENTER);

        add(mainPanel);

        setTitle("FL Calculator"); //titulo del programa
        setSize(new Dimension(400, 500)); //Dimensiones
        setMinimumSize(new Dimension(400, 500));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Comportamiento al cerrar
        setVisible(true);
    }
}
