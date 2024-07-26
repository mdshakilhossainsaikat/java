import javax.swing.*;
import java.awt.event.*;

public class FeetToMeterConverter {
    private JFrame frame;
    private JPanel panel;
    private JTextField feetField, meterField;
    private JLabel feetLabel, meterLabel;
    private JButton convertButton;

    public FeetToMeterConverter() {
        frame = new JFrame("Feet to Meter Converter");
        panel = new JPanel();
        feetLabel = new JLabel("Feet:");
        meterLabel = new JLabel("Meters:");
        feetField = new JTextField(10);
        meterField = new JTextField(10);
        convertButton = new JButton("Convert");

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertFeetToMeter();
            }
        });

        panel.add(feetLabel);
        panel.add(feetField);
        panel.add(meterLabel);
        panel.add(meterField);
        panel.add(convertButton);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void convertFeetToMeter() {
        try {
            double feet = Double.parseDouble(feetField.getText());
            double meters = feet * 0.3048; // 1 foot = 0.3048 meters
            meterField.setText(String.format("%.2f", meters));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid number for feet.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FeetToMeterConverter();
            }
        });
    }
}
