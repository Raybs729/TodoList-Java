import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {

    private TitleBar title; //I want the title at top
    private List list; // List of tasks in the middle
    private ButtonPanel btnPanel; //buttons on the bottom

    AppFrame(){
        this.setSize(700, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // makes the window pop-up in the middle of screen
        this.setVisible(true);

        title = new TitleBar();
        list = new List();
        btnPanel = new ButtonPanel();
        this.add(title, BorderLayout.NORTH);
    }

}
