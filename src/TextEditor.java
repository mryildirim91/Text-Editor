import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame implements ActionListener {

    final int width = 1000;
    final int height = 1000;
    String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    JComboBox fontBox = new JComboBox(fonts);
    JSpinner fontSpinner = new JSpinner();
    JButton colorButton = new JButton("Color");
    TextArea textArea = new TextArea(fontSpinner, colorButton, fontBox);
    ScrollPane scrollPane = new ScrollPane(textArea);
    OptionsBar optionsBar = new OptionsBar();

    TextEditor(){
        setTextEditor();
    }

    private void setTextEditor(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Text Editor");
        setSize(width,height);
        setLayout(new FlowLayout());

        setJMenuBar(optionsBar);
        optionsBar.getSaveItem().addActionListener(this);
        optionsBar.getLoadItem().addActionListener(this);
        optionsBar.getExitItem().addActionListener(this);

        add(new JLabel("Font: "));
        add(fontSpinner);
        add(colorButton);
        add(fontBox);
        add(scrollPane);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (optionsBar.getSaveItem().equals(e.getSource())) {
            SaveLoadFile.saveFile(textArea);
        }
        if (optionsBar.getLoadItem().equals(e.getSource())) {
            SaveLoadFile.loadFile(textArea);
        }
        if (optionsBar.getExitItem().equals(e.getSource())) {
            System.exit(0);
        }
    }
}
