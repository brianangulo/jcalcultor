import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class Screen extends JPanel {
    // state
    private final JLabel content = new JLabel();
    // constructor
    public Screen() {
       setBackground(Color.LIGHT_GRAY);
   }
   public JLabel getContent() {
       return content;
   }
   public void setContent(String newContent) {
        content.setText(newContent);
   }

}
