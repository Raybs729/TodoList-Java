
import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Color;

public class TitleBar extends JPanel{
    public TitleBar() {
        this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(Color.decode("#eedf46"));

//        JFrame frame = new JFrame("Todo List Window");
//        frame.setSize(500,400);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f

        JLabel titleText = new JLabel("To Do List");
        titleText.setFont(new Font("Gill Sans", Font.BOLD, 50));
        titleText.setHorizontalAlignment(JLabel.CENTER);

        this.add(titleText);
    }
}
