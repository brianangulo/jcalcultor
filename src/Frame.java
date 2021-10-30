import javax.swing.JFrame;

public class Frame extends JFrame {
   public Frame(String title) {
        setTitle(title);
        setVisible(true);
        setSize(400, 600);
    }
    public Frame() {
        setTitle("JCalc");
        setVisible(true);
        setSize(400, 600);
        pack();
    }
}
