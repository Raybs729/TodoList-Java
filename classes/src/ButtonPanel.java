import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel{

    private JButton addTask;
    private JButton clear;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    //Constructor
    ButtonPanel(){
        this.setPreferredSize(new Dimension(400, 60));
        //this.setBackground(Color.RED);

        addTask = new JButton("Add Task");
        //addTask.setBorder(emptyBorder); // makes it have no border
        addTask.setFont(new Font("Gill Sans", Font.PLAIN, 20));

        this.add(addTask); //makes button appear

        this.add(Box.createHorizontalStrut(20)); //creates a gap between buttons
        clear = new JButton("Clear Completed Tasks");
        //clear.setBorder(emptyBorder);
        clear.setFont(new Font("Gill Sans", Font.PLAIN, 20));
        this.add(clear);

    }

    public JButton getAddTask(){
        return addTask;
    }

    public JButton getClear(){
        return clear;
    }

}
