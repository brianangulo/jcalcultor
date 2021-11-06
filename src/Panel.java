import java.awt.Color;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Objects;

public class Panel extends JPanel {
  private final ArrayList<Button> addedButtons = new ArrayList<>(16);
  private String buttonClickedContent;
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
        tempBtn.addActionListener(event -> {
            String screenContext = Screen.getTextContent().trim();
            if (screenContext.length() >= 1 && !screenContext.equals("=") && !screenContext.equals("C")) {
                Screen.setContent(Screen.getTextContent().concat(tempBtn.getText()));
            } else {
                Screen.setContent(tempBtn.getText());
            }
            if (Objects.equals(tempBtn.getText(), "=")) {
                try {
                    Screen.setContent(Calculator.getCalculateResult(screenContext));
                } catch (Exception e) {
                    Screen.setContent("Invalid expression");
                }
            } else if (Objects.equals(tempBtn.getText(), "C")) {
                Screen.setContent("");
            }
        });
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
   public String getButtonClickedContent() { return buttonClickedContent; }
}
