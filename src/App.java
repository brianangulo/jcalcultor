import java.awt.BorderLayout;

public class App {
    public static void main(String[] args) {
        // frame
        Frame frame = new Frame("JCalc");
        // panel
        Panel panel = new Panel();
        // calculator screen
        Screen screen = new Screen();
        // grid manager
        GridManager gridManager = new GridManager();
        // adding manager to panel
        panel.setLayout(gridManager);
        // adding panel to frame
        frame.add(panel);
        // add screen to frame
        frame.add(screen, BorderLayout.NORTH);
        // adding list of buttons to panel 
        panel.addButtonsFromListOfStrings(ButtonsData.getButtonTittles());
        screen.addContentToScreen();
    }
}
