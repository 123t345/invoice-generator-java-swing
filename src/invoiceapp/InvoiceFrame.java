package invoiceapp;

import javax.swing.JFrame;

public class InvoiceFrame extends JFrame
{
    public InvoiceFrame()
    {
        setTitle("Invoice Calculator");
        setSize(400,350);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        InvoicePanel panel = new InvoicePanel();
        add(panel);
    }
}