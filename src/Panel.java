import java.awt.Color;
import javax.swing.JPanel;
import java.util.ArrayList;

public class Panel extends JPanel {
  private ArrayList<Button> addedButtons = new ArrayList<>(16);

  public Panel(Color bgColor) {
        setBackground(bgColor);
   }
   public Panel() {
        super();
   }
   /**
    * Adds buttons to the panel based on an array of button titles
    * @param tittleList a string array containing button titles
    */
   public void addButtonsFromListOfStrings(String[] tittleList) {
     for (String title : tittleList) {
        Button tempBtn = new Button(title);
        add(tempBtn);
        addedButtons.add(tempBtn);
     }
   }
   /**
    * Gets buttons currently in panel if any or null
    * @return Button[] or null
    */
   public ArrayList<Button> getAddedButtons() {
     return addedButtons;
   }
}
