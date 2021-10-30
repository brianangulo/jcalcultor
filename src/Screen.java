import javax.swing.JPanel;
import java.awt.*;

public class Screen extends JPanel {
    // state
    private String content;
    // constructor
    public Screen() {
       setBackground(Color.LIGHT_GRAY);
   }
   public String getContent() {
       return content;
   }
   public void setContent(String newContent) {
        content = newContent;
   }
}
