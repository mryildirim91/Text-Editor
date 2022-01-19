import javax.swing.*;
import java.awt.*;

public class TextEditor extends JFrame {

    final int width = 500;
    final int height = 500;

    TextEditor(){
        setTextEditor();
    }

    private void setTextEditor(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Text Editor");
        this.setSize(width,height);
        this.setLayout(new FlowLayout());

        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        JComboBox fontBox = new JComboBox(fonts);
        JSpinner fontSpinner = new JSpinner();
        JButton colorButton = new JButton("Color");
        TextArea textArea = new TextArea(fontSpinner, colorButton, fontBox);
        ScrollPane scrollPane = new ScrollPane(textArea);

        this.add(new JLabel("Font: "));
        this.add(fontSpinner);
        this.add(colorButton);
        this.add(fontBox);
        this.add(scrollPane);
        this.setVisible(true);
    }
}
