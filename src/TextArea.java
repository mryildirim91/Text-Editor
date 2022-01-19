import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea extends JTextArea implements ActionListener {
    final private int fontSize = 25;
    final private int fontSpinnerWidth = 50;
    final private int fontSpinnerHeight = 25;

    TextArea(JSpinner spinner, JButton button, JComboBox comboBox){
        setTextArea();
        changeFontSize(spinner);
        changeTextColor(button);
        changeTextFont(comboBox);
    }

    private void setTextArea(){
        setLineWrap(true);
        setWrapStyleWord(true);
        setFont(new Font("Arial", Font.PLAIN, fontSize));
    }

    private void changeFontSize(JSpinner spinner){
        spinner.setPreferredSize(new Dimension(fontSpinnerWidth,fontSpinnerHeight));
        spinner.setValue(fontSize);
        spinner.addChangeListener(e -> setFont(new Font(getFont().getFamily(), Font.PLAIN, (int) spinner.getValue())));
    }

    private void changeTextFont(JComboBox comboBox){
        comboBox.setSelectedItem("Arial");
        comboBox.addActionListener(e -> setFont(new Font((String) comboBox.getSelectedItem(), Font.PLAIN, getFont().getSize())));
    }

    private void changeTextColor(JButton button){
        button.addActionListener(e -> {
            JColorChooser colorChooser = new JColorChooser();
            Color color = colorChooser.showDialog(null, "Choose a color", Color.black);
            setForeground(color);});
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
