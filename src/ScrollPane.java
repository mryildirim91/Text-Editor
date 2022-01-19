import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Component;
import java.awt.Dimension;

public class ScrollPane extends JScrollPane {
    final int width = 950;
    final int height = 950;

    ScrollPane(Component component){
        super(component);
        super.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        setPreferredSize(new Dimension(width, height));
    }
}
