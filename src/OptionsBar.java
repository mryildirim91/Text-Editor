import javax.swing.*;

public class OptionsBar extends JMenuBar{

    private JMenu fileMenu;
    private JMenuItem loadItem, saveItem, exitItem;

    OptionsBar(){
        super();
        fileMenu = new JMenu("File");
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        add(fileMenu);
    }

    JMenuItem getSaveItem(){
        return saveItem;
    }
    JMenuItem getLoadItem(){
        return loadItem;
    }
    JMenuItem getExitItem(){
        return exitItem;
    }
}
