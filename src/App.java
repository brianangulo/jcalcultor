import java.awt.Color;

public class App {
    public static void main(String[] args) throws Exception {
        //frame
        Frame mainFrame = new Frame("JCalc");
        //panel
        Panel mainPanel = new Panel(Color.GRAY);
        //buttons
        Button helloButton = new Button("Hello", 200, 200);

        helloButton.setBounds(50,100,80,30);
        helloButton.setBackground(Color.CYAN);
        mainPanel.add(helloButton);
        mainFrame.add(mainPanel);
        mainFrame.setLayout(null);
    }
}
