import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class Screen extends JPanel {
    // state
    private static final JLabel content = new JLabel("");
    // constructor
    public Screen() {
       setBackground(Color.LIGHT_GRAY);
   }
   public static String getTextContent() {
       return content.getText();
   }
   public static void setContent(String newContent) {
        content.setText(newContent);
   }
    /**
     * Wrapper for instanced version of add
     */
    public void addContentToScreen() {
        add(content);
    }
}
