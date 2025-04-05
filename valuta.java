package cambiovaluta;
import javax.swing.*;

public class valuta {
    public static void main(String[] args) {
        // Dati delle valute e tassi di cambio
        String[] nazioni = {"Euro", "Pesos", "Dollaro"};
        double[] tassiCambio = {1.0, 20.0, 1.1}; // 1 EUR = 20 MXN, 1 EUR = 1.1 USD

        JFrame frame = new JFrame("Cambio Valute");
        JComboBox<String> combo1 = new JComboBox<>(nazioni);
        JComboBox<String> combo2 = new JComboBox<>(nazioni);
        JTextField amountField = new JTextField(10);
        JLabel resultLabel = new JLabel("Risultato:");

        JButton convertButton = new JButton("Calcola");
        convertButton.addActionListener(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                int from = combo1.getSelectedIndex(), to = combo2.getSelectedIndex();
                resultLabel.setText("Risultato: " + String.format("%.2f", (amount / tassiCambio[from]) * tassiCambio[to]));
            } catch (NumberFormatException ex) {
                resultLabel.setText("riprovare non funziona!");
            }
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(combo1); frame.add(combo2); frame.add(amountField);
        frame.add(convertButton); frame.add(resultLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 150);
        frame.setVisible(true);
    }
}
