import java.awt.Color;
import javax.swing.JPanel;

public class Panel extends JPanel {
  public Panel(Color bgColor) {
        setBackground(bgColor);
   }
   public Panel() {
        super();
   }
   public void addButtonsFromListOfStrings(String[] tittleList) {
      for (String tittle : tittleList) {
          add(new Button(tittle));
      }
   }
}
