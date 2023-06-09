import javax.swing.*;
import java.awt.*;

public class List extends JPanel {
    public List() {
        GridLayout layout = new GridLayout(10, 1);
        layout.setVgap(5);

        this.setLayout(layout);
        this.setBackground(Color.decode("#eede87"));

    }

    public void updateNumbers(){
        Component[] listItems = this.getComponents();

        for(int i = 0; i < listItems.length; i++) {
            if(listItems[i] instanceof Task){
                ((Task) listItems[i]).changeIndex(i+1);
            }
        }
    }
}
