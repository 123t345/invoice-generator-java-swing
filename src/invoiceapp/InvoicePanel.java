package invoiceapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InvoicePanel extends JPanel implements ActionListener
{
    private JTextField subtotalField;
    private JTextField discountPercentField;
    private JTextField discountAmountField;
    private JTextField totalField;

    private JButton calculateButton;
    private JButton exitButton;


    public InvoicePanel()
    {
        setLayout(new FlowLayout());

        // Labels and fields
        add(new JLabel("Subtotal:"));

        subtotalField = new JTextField(10);
        add(subtotalField);


        add(new JLabel("Discount Percent:"));

        discountPercentField = new JTextField(10);
        discountPercentField.setEditable(false);
        add(discountPercentField);


        add(new JLabel("Discount Amount:"));

        discountAmountField = new JTextField(10);
        discountAmountField.setEditable(false);
        add(discountAmountField);


        add(new JLabel("Invoice Total:"));

        totalField = new JTextField(10);
        totalField.setEditable(false);
        add(totalField);


        // Buttons
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);


        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        add(exitButton);
    }


    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == exitButton)
        {
            System.exit(0);
        }


        if(e.getSource() == calculateButton)
        {
            double subtotal = Double.parseDouble(subtotalField.getText());

            double discountPercent;

            if(subtotal >= 200)
            {
                discountPercent = 20;
            }
            else if(subtotal >= 100)
            {
                discountPercent = 10;
            }
            else
            {
                discountPercent = 0;
            }


            double discountAmount =
                    subtotal * discountPercent / 100;


            double invoiceTotal =
                    subtotal - discountAmount;


            discountPercentField.setText(
                    discountPercent + "%");


            discountAmountField.setText(
                    String.format("%.2f", discountAmount));


            totalField.setText(
                    String.format("%.2f", invoiceTotal));
        }
    }
}
