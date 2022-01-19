import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SaveLoadFile {

    static void loadFile(TextArea textArea){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
        fileChooser.setFileFilter(filter);

        int response = fileChooser.showOpenDialog(null);

        if(response == JFileChooser.APPROVE_OPTION) {
            File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
            Scanner fileIn = null;

            try {
                fileIn = new Scanner(file);
                if(file.isFile()) {
                    while(fileIn.hasNextLine()) {
                        String line = fileIn.nextLine()+"\n";
                        textArea.append(line);
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            finally {
                fileIn.close();
            }
        }
    }

    static void saveFile(TextArea textArea){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));

        int response = fileChooser.showSaveDialog(null);

        if(response == JFileChooser.APPROVE_OPTION) {
            File file;
            PrintWriter fileOut = null;

            file = new File(fileChooser.getSelectedFile().getAbsolutePath());
            try {
                fileOut = new PrintWriter(file);
                fileOut.println(textArea.getText());
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            finally {
                fileOut.close();
            }
        }
    }
}
