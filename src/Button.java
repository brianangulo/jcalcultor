import javax.swing.JButton;

public class Button extends JButton {
   public Button(String btnTxt, int buttonWidth, int buttonHeight) {
        setText(btnTxt);
        setSize(buttonWidth, buttonHeight);
    }
    public Button(String btnTxt) {
        setText(btnTxt);
    }
}
