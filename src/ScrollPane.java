import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Component;
import java.awt.Dimension;

public class ScrollPane extends JScrollPane {
    final int width = 450;
    final int height = 450;

    ScrollPane(Component component){
        super(component);
        super.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        this.setPreferredSize(new Dimension(width, height));
    }
}
